package com.project.trans.Service.ServiceImpl;

import com.project.trans.Bean.Article;
import com.project.trans.Mapper.Articlemapper;
import com.project.trans.Service.ArticleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private Articlemapper articlemapper;

    /**
     * 查询文章
     * @return
     */
    @Override
    public List<Article> selectarticles(){
        return articlemapper.selectArticles();
    }
    /**
     * 添加文章信息
     * @param article
     */
    @Override
    public void insertarticle(Article article){
        articlemapper.insertArticle(article);
    }
    /**
     * 根据id删除文章信息
     * @param id 文章id
     */
    @Override
    public void deletearticle(int id){
        articlemapper.deleteArticle(id);
    }
    /**
     * 更新文章信息
     * @param article
     */
    @Override
    public void updatearticle(Article article){
        articlemapper.updateArticle(article);
    }

    /**
     *根据文章标题和文章作者查询文章信息
     * @param articleTitle 文章标题
     * @param articleAuthor 文章作者
     * @return
     */
    @Override
    public List<Article> selectarticlebycondition(String articleTitle,String articleAuthor){
        return articlemapper.selectArticleByCondition(articleTitle,articleAuthor);
    }
}
