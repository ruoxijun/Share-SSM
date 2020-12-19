package ruoxijun.dao;

import ruoxijun.pojo.Article;

import java.util.List;

/**
 * 博文表表操作映射接口
 */
public interface ArticlesMapper {
    /* 常规方法 */
    List<Article> queryArticles(); // 推荐博文
    List<Article> findArticles(String msg); // 搜索博文
    Article queryArticle(int id);
    List<Article> queryUserArticles(String userId); // 某用户所有博文
    List<Article> queryAttArticles(String userId); // 关注用户的文章
    int addArticle(Article article);
    int updateArticle(Article article);
    int addLikeArticle(int articleId); // 增加点赞数
    int addViewArticle(int articleId); // 增加观看数
    int deleteArticle(int id);
}
