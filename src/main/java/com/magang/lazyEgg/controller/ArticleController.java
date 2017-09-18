package com.magang.lazyEgg.controller;

import com.magang.core.DataGridPage;
import com.magang.lazyEgg.pojo.Article;
import com.magang.lazyEgg.pojo.SysUser;
import com.magang.lazyEgg.service.IArticleService;
import com.magang.lazyEgg.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by magang on 2017/9/13.
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    //获取当前用户的所有文章
    @RequestMapping("/selectArticles")
    @ResponseBody
    public DataGridPage<Article> selectArticles(HttpServletRequest request,
                                          @RequestParam(required=false,defaultValue="1") Integer page,
                                          @RequestParam(required=false,defaultValue="10") Integer rows) {
        /**
         * 获取当前用户ID
         */
        String userId = "1";

        DataGridPage<Article> articles= this.articleService.selectArticles(userId,page,rows);
        return articles;
    }

    //获取当前用户顶部文章
    @RequestMapping("/selectTopArticles")
    @ResponseBody
    public List<Article> selectTopArticles(HttpServletRequest request) {
        /**
         * 获取当前用户ID
         */
        String userId = "1";

        List<Article> articles= this.articleService.selectTopArticles(userId);
        return articles;
    }
}
