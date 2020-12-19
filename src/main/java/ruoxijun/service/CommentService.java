package ruoxijun.service;

import ruoxijun.pojo.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> queryComments(int id);
    int addComment(Comment comment);
    int deleteComment(int id);
}
