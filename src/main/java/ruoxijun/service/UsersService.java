package ruoxijun.service;

import ruoxijun.pojo.User;

import java.util.List;
import java.util.Map;

public interface UsersService {
    List<User> queryUsers();
    User queryUser(User user);
    User queryUserExist(User user);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(String id);
    int attNum(String id); // 关注人数
    int friendNum(String id); // 粉丝人数
    List<User> attUsers(String id); // 关注的用户
    List<User> friendUsers(String id); // 我的粉丝
    boolean isFriend(Map<String,String> map); // 是否关注
    boolean attUser(Map<String,String> map); // 关注某人
    boolean canAttUser(Map<String,String> map); // 取消关注某人
}
