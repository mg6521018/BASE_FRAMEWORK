package com.magang.lazyEgg.service;

import com.magang.core.DataGridPage;
import com.magang.lazyEgg.pojo.Article;

import java.util.List;

public interface IArticleService {
    int deleteByPrimaryKey(Integer id);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);

    DataGridPage<Article> selectArticles(String userId, Integer page, Integer rows);

    List<Article> selectTopArticles(String userId);
}