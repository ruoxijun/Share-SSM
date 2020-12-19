package ruoxijun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ruoxijun.dao.UsersMapper;
import ruoxijun.pojo.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("UsersService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<User> queryUsers() {
        return usersMapper.queryUsers();
    }

    @Override
    public User queryUser(User user) {
        return usersMapper.queryUser(user);
    }

    @Override
    public User queryUserExist(User user) {
        return usersMapper.queryUserExist(user);
    }

    @Override
    public int addUser(User user) {
        return usersMapper.addUser(user);
    }

    @Override
    public int updateUser(User user) {
        return usersMapper.updateUser(user);
    }

    @Override
    public int deleteUser(String id) {
        return usersMapper.deleteUser(id);
    }

    @Override // 关注人数
    public int attNum(String id) {
        return usersMapper.attNum(id);
    }

    @Override // 粉丝数
    public int friendNum(String id) {
        return usersMapper.friendNum(id);
    }

    @Override // 关注的用户
    public List<User> attUsers(String id) {
        return usersMapper.attUsers(id);
    }

    @Override // 我的粉丝
    public List<User> friendUsers(String id) {
        return usersMapper.friendUsers(id);
    }

    @Override // 是否关注了某人
    public boolean isFriend(Map<String, String> map) {
        int friend = usersMapper.isFriend(map);
        if (friend==1) return true;
        return false;
    }

    @Override // 关注某人
    public boolean attUser(Map<String, String> map) {
        int friend = usersMapper.attUser(map);
        if (friend==1) return true;
        return false;
    }

    @Override // 取消关注某人
    public boolean canAttUser(Map<String, String> map) {
        int friend = usersMapper.canAttUser(map);
        if (friend==1) return true;
        return false;
    }
}
