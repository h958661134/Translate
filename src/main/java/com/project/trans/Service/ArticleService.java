package com.project.trans.Service;

import com.project.trans.Bean.Article;

import java.util.List;

public interface ArticleService {
    /**
     * 查询所有文章信息
     * @return
     */
    public List<Article> selectArticles();

    /**
     * 插入文章信息
     * @param article
     */
    public void insertArticle(Article article);

    /**
     * 根据id删除文章信息
     * @param id
     */
    public void deleteArticle(int id);

    /**
     * 更新文章信息
     * @param article
     */
    public void updateArticle(Article article);
}
