package com.project.trans.Service;

import com.project.trans.Bean.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ArticleService {
    /**
     * 查询所有文章信息
     * @return
     */
    public List<Article> selectarticles();

    /**
     * 插入文章信息
     * @param article
     */
    public void insertarticle(Article article);

    /**
     * 根据id删除文章信息
     * @param id
     */
    public void deletearticle(int id);

    /**
     * 更新文章信息
     * @param article
     */
    public void updatearticle(Article article);
    /**
     * 根据文章标题和作者进行模糊查询
     * @param articleTitle 文章标题
     * @param articleAuthor 文章作者
     * @return
     */
    public List<Article> selectarticlebycondition(@Param("articleTitle") String articleTitle,@Param("articleAuthor") String articleAuthor);
}
