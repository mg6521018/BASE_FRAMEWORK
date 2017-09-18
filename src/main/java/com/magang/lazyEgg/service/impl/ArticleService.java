package com.magang.lazyEgg.service.impl;

import com.github.pagehelper.PageHelper;
import com.magang.core.DataGridPage;
import com.magang.core.freemark.FreemarkEngine;
import com.magang.lazyEgg.dao.ArticleMapper;
import com.magang.lazyEgg.dao.SysFileMapper;
import com.magang.lazyEgg.pojo.Article;
import com.magang.lazyEgg.pojo.SysFile;
import com.magang.lazyEgg.service.IArticleService;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by magang on 2017/9/13.
 */
@Service("articleService")
public class ArticleService implements IArticleService{

    private static final String articleTemplateName = "article.ftl";
    private static final String topArticleTemplateName = "article-li.ftl";

    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private SysFileMapper sysFileMapper;
    @Autowired
    private FreemarkEngine freemarkEngine;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return articleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Article record) {
        return articleMapper.insert(record);
    }

    @Override
    public int insertSelective(Article record) {
        return articleMapper.insertSelective(record);
    }

    @Override
    public Article selectByPrimaryKey(Integer id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Article record) {
        return articleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Article record) {
        return articleMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(Article record) {
        return articleMapper.updateByPrimaryKey(record);
    }

    @Override
    public DataGridPage<Article> selectArticles(String userId, Integer page, Integer rows){
        PageHelper.startPage(page,rows);
        Map params = new HashMap<String,Object>();
        params.put("userId",userId);
        List<Article> list = articleMapper.getAll(params);
        if(null == list){
            list = new ArrayList();
        }

        /**
         * 通过模板解析数据
         */
        for(Article article : list){
            Map map = new HashMap<String,Object>();
            article.setUserName("赵小刀");
            map.put("article",article);
            try {
                SysFile sysFile = sysFileMapper.selectByPrimaryKey(article.getImgid());
                if(null != sysFile){
                    map.put("imgPath","/lazyegg/"+sysFile.getFilepath());
                }
                String html = freemarkEngine.mergeTemplateIntoString( articleTemplateName , map );
                System.out.println(html);
                article.setTemplateHtml(html);

            } catch (TemplateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return DataGridPage.create(list);
    }

    @Override
    public List<Article> selectTopArticles(String userId){
        PageHelper.startPage(1,3);
        Map params = new HashMap<String,Object>();
        params.put("userId",userId);
        List<Article> list = articleMapper.getAll(params);
        if(null == list){
            list = new ArrayList();
        }

        /**
         * 通过模板解析数据
         */
        for(Article article : list){
            Map map = new HashMap<String,Object>();
            article.setUserName("赵小刀");
            map.put("article",article);
            try {
                SysFile sysFile = sysFileMapper.selectByPrimaryKey(article.getImgid());
                if(null != sysFile){
                    map.put("imgPath","/lazyegg/"+sysFile.getFilepath());
                }
                String html = freemarkEngine.mergeTemplateIntoString( topArticleTemplateName , map );
                article.setTemplateHtml(html);

            } catch (TemplateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void main(String [] args){
        System.out.println(System.currentTimeMillis());
    }
}

