import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ruoxijun.pojo.Article;
import ruoxijun.service.ArticlesService;

import java.util.List;

public class ArticlesTest {

    @Test
    public void demoTest(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        ArticlesService articlesService = context.getBean("articlesService", ArticlesService.class);
        List<Article> articles = articlesService.queryArticles();
        System.out.println(articles);
    }
}
