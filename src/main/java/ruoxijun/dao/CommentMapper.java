package ruoxijun.dao;

import ruoxijun.pojo.Comment;

import java.util.List;

public interface CommentMapper {
    List<Comment> queryComments(int id);
    int addComment(Comment comment);
    int deleteComment(int id);
}
