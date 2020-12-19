package ruoxijun.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ruoxijun.dao.ArticlesMapper;
import ruoxijun.pojo.Article;
import ruoxijun.util.Msg;

import java.util.List;

@Service("articlesService")
public class ArticlesServiceImpl implements ArticlesService {
    public static final int PAGE_SIZE = 7;

    @Autowired
    private ArticlesMapper articlesMapper;

    @Override
    public List<Article> queryArticles() {
        return articlesMapper.queryArticles();
    }
    @Override
    public Article queryArticle(int id) {
        return articlesMapper.queryArticle(id);
    }
    @Override
    public int addArticle(Article article) {
        return articlesMapper.addArticle(article);
    }
    @Override
    public int updateArticle(Article article) {
        return articlesMapper.updateArticle(article);
    }
    @Override
    public int deleteArticle(int id) {
        return articlesMapper.deleteArticle(id);
    }

    // 分页查询所有博文
    @Override
    public PageInfo queryArticlePageNum(int pageNum) {
        // 参1：当前第几页，参2：每页的数据量（数据条数）
        PageHelper.startPage(pageNum,PAGE_SIZE);
        List<Article> articles = articlesMapper.queryArticles();
        // PageInfo对结果进行包装,参1：查询的数据集合，参2：连续显示的页数
        PageInfo pageInfo = new PageInfo(articles,5);
        return pageInfo;
    }

    @Override // 某用户的博文
    public PageInfo queryUserArticles(String userId,int pageNum) {
        PageHelper.startPage(pageNum,PAGE_SIZE);
        List<Article> articles = articlesMapper.queryUserArticles(userId);
        PageInfo pageInfo = new PageInfo(articles, 5);
        return pageInfo;
    }

    @Override // 关注用户的博文
    public PageInfo queryAttArticles(String userId,int pageNum) {
        PageHelper.startPage(pageNum,PAGE_SIZE);
        List<Article> articles = articlesMapper.queryAttArticles(userId);
        PageInfo pageInfo = new PageInfo(articles,5);
        return pageInfo;
    }

    @Override // 增加点赞数
    public boolean addLikeArticle(int articleId) {
        int i = articlesMapper.addLikeArticle(articleId);
        if (i==1) return true;
        return false;
    }

    @Override // 增加观看数
    public boolean addViewArticle(int articleId) {
        int i = articlesMapper.addViewArticle(articleId);
        if (i==1) return true;
        return false;
    }

    @Override
    public PageInfo findArticles(String con,int pageNum) {
        PageHelper.startPage(pageNum,PAGE_SIZE);
        List<Article> articles = articlesMapper.findArticles(con);
        PageInfo pageInfo = new PageInfo(articles,5);
        return pageInfo;
    }

}
