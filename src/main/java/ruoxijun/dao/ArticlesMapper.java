package ruoxijun.dao;

import ruoxijun.pojo.Article;

import java.util.List;

/**
 * 博文表表操作映射接口
 */
public interface ArticlesMapper {
    /* 常规方法 */
    List<Article> queryArticles();
    Article queryArticle(int id);
    int addArticle(Article article);
    int updateArticle(Article article);
    int deleteArticle(int id);
}
