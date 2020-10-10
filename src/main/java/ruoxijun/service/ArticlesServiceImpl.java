package ruoxijun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ruoxijun.dao.ArticlesMapper;
import ruoxijun.pojo.Article;

import java.util.List;

@Service("articlesService")
public class ArticlesServiceImpl implements ArticlesService {

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
}
