package ruoxijun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ruoxijun.pojo.User;
import ruoxijun.service.UsersService;
import ruoxijun.util.Msg;
import ruoxijun.util.MyDateFormat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class UsersController {

    @Autowired
    UsersService usersService;

    @ResponseBody
    @RequestMapping("/queryUsers")
    public Msg queryUsers(){
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("userList",usersService.queryUsers());
        return msg;
    }

    @ResponseBody // 验证账户
    @RequestMapping("/queryUser")
    public Msg queryUser(User user){
        User queryUser = usersService.queryUser(user);
        if (queryUser!=null){
            if (queryUser.getRegistrationTime()!=null) {
                queryUser.setRegistrationTime(
                        MyDateFormat.queryDate(
                                Long.parseLong(
                                        queryUser.getRegistrationTime())));
            }
        }

        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("user",queryUser);
        return msg;
    }

    @ResponseBody // 查询某一用户
    @RequestMapping("/queryUserExist")
    public Msg queryUserExist(User user){
        User queryUserExist = usersService.queryUserExist(user);
        if (queryUserExist!=null) {
            if (queryUserExist.getRegistrationTime() != null) {
                queryUserExist.setRegistrationTime(
                        MyDateFormat.queryDate(
                                Long.parseLong(
                                        queryUserExist.getRegistrationTime())));
            }
        }
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("user",queryUserExist);
        return msg;
    }

    @ResponseBody // 添加用户
    @RequestMapping("/addUser")
    public Msg addUser(User user){
        Msg msg = new Msg();
        msg.setCode(100);
        int i = usersService.addUser(user);
        msg.addMsg("user",i);
        return msg;
    }

    @ResponseBody // 查询用户的关注数和粉丝数
    @RequestMapping("/userFriendNum")
    public Msg userFriendNum(String id){
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("attNum",usersService.attNum(id));
        msg.addMsg("friendNum",usersService.friendNum(id));
        return msg;
    }

    @ResponseBody // 关注的用户列表
    @RequestMapping(value = "/attUsers")
    public Msg attUsers(String id){
        List<User> users = usersService.attUsers(id);
        for (User user : users) {
            if (user.getRegistrationTime()==null) continue;
            user.setRegistrationTime(
                    MyDateFormat.queryDate(
                            Long.parseLong(
                                    user.getRegistrationTime())));
        }
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("attUsers",users);
        return msg;
    }

    @ResponseBody // 我的粉丝列表
    @RequestMapping(value = "/friendUsers")
    public Msg friendUsers(String id){
        List<User> users = usersService.friendUsers(id);
        for (User user : users) {
            if (user.getRegistrationTime()==null) continue;
            user.setRegistrationTime(
                    MyDateFormat.queryDate(
                            Long.parseLong(
                                    user.getRegistrationTime())));
        }
        Msg msg = new Msg();
        msg.setCode(100);
        msg.addMsg("friendUsers",users);
        return msg;
    }

    @ResponseBody
    @RequestMapping(value = "/isFriend") // 是否关注某人
    public Msg isFriend(String userId,String friendsId){
        HashMap<String,String> map = new HashMap<>();
        map.put("userId",userId);
        map.put("friendsId",friendsId);
        boolean friend = usersService.isFriend(map);
        Msg msg = new Msg()
                .addMsg("friend",friend);
        msg.setCode(100);
        return msg;
    }

    @ResponseBody
    @RequestMapping(value = "/attUser") // 关注某人
    public Msg attUser(String userId,String friendsId){
        HashMap<String,String> map = new HashMap<>();
        map.put("userId",userId);
        map.put("friendsId",friendsId);
        boolean attUser = false;
        if (!usersService.isFriend(map)){
            attUser = usersService.attUser(map);
        }
        Msg msg = new Msg()
                .addMsg("attUser",attUser);
        msg.setCode(100);
        return msg;
    }

    @ResponseBody
    @RequestMapping(value = "/canAttUser") // 取消关注某人
    public Msg canAttUser(String userId,String friendsId){
        HashMap<String,String> map = new HashMap<>();
        map.put("userId",userId);
        map.put("friendsId",friendsId);
        boolean canAttUser = usersService.canAttUser(map);
        Msg msg = new Msg()
                .addMsg("canAttUser",canAttUser);
        msg.setCode(100);
        return msg;
    }
}
