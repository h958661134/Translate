package com.project.trans.Controller;

import com.project.trans.Bean.Article;
import com.project.trans.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 查询所有文章
     * @return
     */
    @RequestMapping("/article/selectall")
   public List<Article> selectall(){
       return articleService.selectarticles();
   }
    /**
     * 根据id删除文章信息
     * @param id
     */
    @RequestMapping("/article/deletearticle")
    public void deletearticle(int id)
    {
        articleService.deletearticle(id);
    }

    /**
     * 更新文章信息
     * @param article
     */
    @RequestMapping("/article/updatearticle")
    public void updatearticle(Article article)
    {
        articleService.updatearticle(article);
    }

    /**
     * 插入文章信息
     * @param article
     */
    @RequestMapping("/article/insertarticle")
    public void insertarticle(Article article){
        article.setViewNumber(0);
        articleService.insertarticle(article);
    }

    /**
     * 模糊查询文章信息
     */
    @RequestMapping("/article/selectarticlebycondition")
    public List<Article> selectarticlebycondition(String articleTitle,String articleAuthor){
        return articleService.selectarticlebycondition(articleTitle,articleAuthor);
    }
}
