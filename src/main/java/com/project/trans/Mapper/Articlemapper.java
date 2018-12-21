package com.project.trans.Mapper;

import com.project.trans.Bean.Article;

import java.util.List;

public interface Articlemapper {
    /**
     * 查询文章
     * @param condition 当根据条件查询的时候写入条件
     * @return
     */
    public List<Article> selectArticles(String condition);

    /**
     * 添加文章信息
     * @param article
     */
    public void insertArticle(Article article);

    /**
     * 根据id删除文章信息
     * @param id 文章id
     */
    public void deleteArticle(int id);

    /**
     * 更新文章信息
     * @param article
     */
    public void updateArticle(Article article);
}
