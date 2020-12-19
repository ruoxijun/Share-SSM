package ruoxijun.service;

import com.github.pagehelper.PageInfo;
import ruoxijun.pojo.Article;
import ruoxijun.util.Msg;

import java.util.List;

public interface ArticlesService {
    /* 常规方法 */
    List<Article> queryArticles();
    Article queryArticle(int id);
    int addArticle(Article article);
    int updateArticle(Article article);
    int deleteArticle(int id);
    PageInfo queryArticlePageNum(int pageNum);
    PageInfo queryUserArticles(String userId,int pageNum);// 某用户所有博文
    PageInfo queryAttArticles(String userId,int pageNum); // 关注用户的文章
    boolean addLikeArticle(int articleId); // 增加点赞数
    boolean addViewArticle(int articleId); // 增加观看数
    PageInfo findArticles(String con,int pageNum); // 搜索博文
}
