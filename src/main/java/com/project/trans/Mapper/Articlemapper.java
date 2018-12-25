package com.project.trans.Mapper;

import com.project.trans.Bean.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Articlemapper {
    /**
     * 查询文章
     * @return
     */
    public List<Article> selectArticles();

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

    /**
     * 根据文章标题和作者进行模糊查询
     * @param articleTitle 文章标题
     * @param articleAuthor 文章作者
     * @return
     */
    public List<Article> selectArticleByCondition(@Param("articleTitle") String articleTitle, @Param("articleAuthor") String articleAuthor);
}
