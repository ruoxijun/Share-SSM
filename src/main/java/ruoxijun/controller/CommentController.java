package ruoxijun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ruoxijun.pojo.Comment;
import ruoxijun.service.CommentService;
import ruoxijun.util.Msg;
import ruoxijun.util.MyDateFormat;

import java.util.List;

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @ResponseBody
    @RequestMapping(value = "/queryComments")
    public Msg queryComments(int id){
        List<Comment> comments = commentService.queryComments(id);
        for (Comment comment : comments) {
            if ((comment.getDate()==null)) continue;
            comment.setDate(MyDateFormat.queryDate(
                    Long.parseLong(comment.getDate())));
        }
        Msg msg = new Msg()
                .addMsg("comments",comments);
        msg.setCode(100);
        return msg;
    }

    @ResponseBody
    @RequestMapping(value = "/addComment")
    public Msg addComment(Comment comment){
        Msg msg = new Msg()
                .addMsg("addComment",commentService.addComment(comment));
        msg.setCode(100);
        return msg;
    }

    @ResponseBody
    @RequestMapping(value = "/deleteComment")
    public Msg deleteComment(int id){
        Msg msg = new Msg()
                .addMsg("deleteComment",commentService.deleteComment(id));
        msg.setCode(100);
        return msg;
    }

}
