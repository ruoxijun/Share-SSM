import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ruoxijun.pojo.Comment;
import ruoxijun.service.CommentService;

import java.util.List;

public class CommentText {
    @Test
    public void commentText(){
        ApplicationContext context = new
            ClassPathXmlApplicationContext
                ("applicationContext.xml");
        CommentService bean = context
                .getBean("commentService", CommentService.class);

//        List<Comment> comments = bean.queryComments(16);
//        System.out.println(comments);

//        int test4 = bean.addComment(new Comment(0, "49082462",
//                "", 16, 0, "", "test4"));
//        System.out.println("test4 : "+test4);

        int i = bean.deleteComment(4);
        System.out.println("delete : "+i);
    }
}
