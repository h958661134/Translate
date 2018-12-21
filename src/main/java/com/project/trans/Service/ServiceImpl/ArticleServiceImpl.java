package com.project.trans.Service.ServiceImpl;

import com.project.trans.Bean.Article;
import com.project.trans.Mapper.Articlemapper;
import com.project.trans.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private Articlemapper articlemapper;

    /**
     * 根据条件查询文章信息
     * @param condition
     * @return
     */
    @Override
    public List<Article> selectArticles(String condition){
        return articlemapper.selectArticles(condition);
    }

    /**
     * 插入文章信息
     * @param article
     */
    @Override
    public void insertArticle(Article article){
         articlemapper.insertArticle(article);
    }

    /**
     * 根据id删除文章信息
     * @param id
     */
    @Override
    public void deleteArticle(int id){
        articlemapper.deleteArticle(id);
    }

    /**
     * 更新
     * @param article
     */
    @Override
    public void updateArticle(Article article){
        articlemapper.updateArticle(article);
    }
}
