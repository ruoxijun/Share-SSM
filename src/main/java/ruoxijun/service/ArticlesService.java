package ruoxijun.service;

import ruoxijun.pojo.Article;

import java.util.List;

public interface ArticlesService {
    /* 常规方法 */
    List<Article> queryArticles();
    Article queryArticle(int id);
    int addArticle(Article article);
    int updateArticle(Article article);
    int deleteArticle(int id);
}
