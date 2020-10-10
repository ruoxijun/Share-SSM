package ruoxijun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ruoxijun.pojo.Article;
import ruoxijun.service.ArticlesService;

import java.util.List;

@Controller
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @ResponseBody
    @RequestMapping("/queryArticles")
    public List<Article> queryArticles(){
        return articlesService.queryArticles();
    }
    @ResponseBody
    @RequestMapping(value = "/queryArticle")
    public Article queryArticle(int id){
        return articlesService.queryArticle(id);
    }
}
