package ruoxijun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ruoxijun.pojo.Article;
import ruoxijun.service.ArticlesService;
import ruoxijun.util.Msg;
import ruoxijun.util.MyDateFormat;

import java.util.List;

@Controller
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    // 分页查询博文
    @ResponseBody
    @RequestMapping("/queryArticlePageNum")
    public Msg queryArticlePageNum(int pageNum) {
        PageInfo pageInfo = articlesService.queryArticlePageNum(pageNum);
        List<Article> list = pageInfo.getList();
        for (Article article : list) {
            if ((article.getDate()==null)) continue;
            article.setDate(MyDateFormat.queryDate(
                    Long.parseLong(article.getDate())));
        }
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("pageInfo",pageInfo);
        return msg;
    }

    // 所有博文数据json
    @ResponseBody
    @RequestMapping("/queryArticles")
    public Msg queryArticles() {
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("articlesList",articlesService.queryArticles());
        return msg;
    }

    // 根据id获取博文
    @ResponseBody
    @RequestMapping(value = "/queryArticle")
    public Msg queryArticle(int id) {
        Article article = articlesService.queryArticle(id);
        if (article!=null) {
            if (article.getDate()!=null){
                article.setDate(MyDateFormat.queryDate(
                        Long.parseLong(article.getDate())));
            }
        }
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("pageInfo",article);
        return msg;
    }

    // 根据用户id获取该用户所有博文
    @ResponseBody
    @RequestMapping(value = "/queryUserArticles")
    public Msg queryUserArticles(String id,int pageNum) {
        PageInfo pageInfo = articlesService.queryUserArticles(id,pageNum);
        List<Article> list = pageInfo.getList();
        for (Article article : list) {
            if ((article.getDate()==null)) continue;
            article.setDate(MyDateFormat.queryDate(
                    Long.parseLong(article.getDate())));
        }
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("pageInfo",pageInfo);
        return msg;
    }

    // 查询关注的用户文章
    @ResponseBody
    @RequestMapping(value = "/queryAttArticles")
    public Msg queryAttArticles(String id,int pageNum) {
        PageInfo pageInfo = articlesService.queryAttArticles(id,pageNum);
        List<Article> list = pageInfo.getList();
        for (Article article : list) {
            if ((article.getDate()==null)) continue;
            article.setDate(MyDateFormat.queryDate(
                    Long.parseLong(article.getDate())));
        }
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("pageInfo",pageInfo);
        return msg;
    }

    // 查询关注的用户文章
    @ResponseBody
    @RequestMapping(value = "/findArticles")
    public Msg findArticles(String con,int pageNum) {
        PageInfo pageInfo = articlesService.findArticles(con,pageNum);
        List<Article> list = pageInfo.getList();
        for (Article article : list) {
            if ((article.getDate()==null)) continue;
            article.setDate(MyDateFormat.queryDate(
                    Long.parseLong(article.getDate())));
        }
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("pageInfo",pageInfo);
        return msg;
    }

    // 添加博文
    @ResponseBody
    @RequestMapping(value = "/addArticle")
    public Msg addArticle(Article article) {
        Msg msg = new Msg();
        if (article.getUserId()!=null &&
            article.getTitle()!=null &&
            article.getContext()!=null &&
            article.getDate()!=null){
            msg.setCode(100);
            msg.addMsg("add",articlesService.addArticle(article));
        } else { msg.setCode(500); }
        return msg;
    }

    // 修改博文
    @ResponseBody
    @RequestMapping(value = "/updateArticle")
    public Msg updateArticle(Article article) {
        Msg msg = new Msg();
        msg.setCode(100);
        if (article.getTitle()!=null &&
                article.getContext()!=null) {
            msg.addMsg("updateArticle",articlesService.updateArticle(article));
        } else{
            msg.addMsg("updateArticle",0);
        }
        return msg;
    }

    // 删除博文
    @ResponseBody
    @RequestMapping(value = "/deleteArticle")
    public Msg deleteArticle(int articleId) {
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("deleteArticle",articlesService.deleteArticle(articleId));
        return msg;
    }

    @ResponseBody
    @RequestMapping("/addLikeArticle") // 增加点赞数
    public Msg addLikeArticle(int articleId) {
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("like",articlesService.addLikeArticle(articleId));
        return msg;
    }

    @ResponseBody
    @RequestMapping("/addViewArticle") // 增加观看数
    public Msg addViewArticle(int articleId) {
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("view",articlesService.addViewArticle(articleId));
        return msg;
    }
}
