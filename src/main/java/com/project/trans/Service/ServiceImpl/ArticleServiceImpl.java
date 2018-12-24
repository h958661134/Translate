package com.project.trans.Service.ServiceImpl;

import com.project.trans.Bean.Article;
import com.project.trans.Mapper.Articlemapper;
import com.project.trans.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private Articlemapper articlemapper;

    /**
     * 查询文章
     * @return
     */
    @Override
    public List<Article> selectArticles(){
        return articlemapper.selectArticles();
    }
    /**
     * 添加文章信息
     * @param article
     */
    @Override
    public void insertArticle(Article article){
        articlemapper.insertArticle(article);
    }
    /**
     * 根据id删除文章信息
     * @param id 文章id
     */
    public void deleteArticle(int id){
        articlemapper.deleteArticle(id);
    }
    /**
     * 更新文章信息
     * @param article
     */
    public void updateArticle(Article article){
        articlemapper.updateArticle(article);
    }
}
