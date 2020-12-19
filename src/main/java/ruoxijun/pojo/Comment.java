package ruoxijun.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private int id;
    private String userId;
    private String userName;
    private int articleId;
    private int likeCount;
    private String date;
    private String content;
}
