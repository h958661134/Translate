package com.project.trans.Controller;

import com.project.trans.Bean.Article;
import com.project.trans.Service.ArticleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
public class ArticleController {

    private ArticleService articleService;

    /**
     * 查询所有文章
     * @return
     */
    @RequestMapping("/article/selectall")
   public List<Article> selectall(){
       return articleService.selectArticles();
   }
    /**
     * 根据id删除文章信息
     * @param id
     */
    @RequestMapping("/article/deleteArticle")
    public void deleteArticle(int id)
    {
        articleService.deleteArticle(id);
    }

    /**
     * 更新文章信息
     * @param article
     */
    @RequestMapping("/article/updateArticle")
    public void updateArticle(Article article)
    {
        Date date=new Date();
        article.setUpdateTime(date.toString());
        articleService.updateArticle(article);
    }

    /**
     * 插入文章信息
     * @param article
     */
    @RequestMapping("/article/insertArticle")
    public void insertArticle(Article article){
        Date date=new Date();
        article.setContent(date.toString());
        article.setUpdateTime(date.toString());
        article.setViewNumber(0);
        articleService.insertArticle(article);
    }
}
