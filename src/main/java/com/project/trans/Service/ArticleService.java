package com.project.trans.Service;

import com.project.trans.Bean.Article;

import java.util.List;

public interface ArticleService {
    /**
     * 根据条件查询信息
     * @param condition
     * @return
     */
     public List<Article> selectArticles(String condition);

    /**
     * 插入文章信息
     * @param article
     */
     public void insertArticle(Article article);

    /**
     * 根据id删除信息
     * @param id
     */
     public void deleteArticle(int id);

    /**
     * 更新文章信息
     * @param article
     */
     public void updateArticle(Article article);
 }
