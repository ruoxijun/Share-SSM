import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ruoxijun.dao.UsersMapper;
import ruoxijun.pojo.User;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserTest {
    @Test
    public void DemoTest() throws IOException {
//        ApplicationContext context = new ClassPathXmlApplicationContext
//                ("applicationContext.xml");
//        UsersMapper mapper = context
//                .getBean("usersMapper", UsersMapper.class);
//        ObjectMapper objectMapper = new ObjectMapper();
//        mapper.addUser(new User("12341543","oooo","111",1,null));
//        mapper.updateUser(new User("12341543","xxoo","22",1,null));
//        mapper.deleteUser("12341543");
//        List<User> users = mapper.queryUsers();
//        for (User user : users) {
//            String userStr = objectMapper.writeValueAsString(user);
//            System.out.println(objectMapper.writeValueAsString(user));
//            User user1 = objectMapper.readValue(userStr, User.class);
//            System.out.println(user1);
//            System.out.println("_-------------------------------------------------------------__");
//        }
//        System.out.println("ID查询："+mapper.queryUser("281441329"));

        // jackson 对象
//        ObjectMapper mapper = new ObjectMapper();
        // 对java象转化为json字符串
//        String json = mapper.writeValueAsString(new User());
//        // 将java对象转化为json字符串并序列化为json文件
//        mapper.writeValue(new File("json/js.json"),new User());
//        // json字符串转java对象
//        User user = mapper.readValue(json, User.class);
//        // 将读取的json文件（或者url）转化为java对象
//        User user2 = mapper.readValue(new File("json/js.json"), User.class);
//        // 使用TypeReference将json字符串转化为集合（list,map）
//        ArrayList<String> list =
//                mapper.readValue(json,new TypeReference<ArrayList<String>>(){});
//        HashMap<String, Object> map =
//                mapper.readValue(json,new TypeReference<HashMap<String, Object>>(){});
        // 通过ObjectMapper将json字符串转化为JsonNode对象
//        String json = "{" +
//                "\"name\":\"my\"," +
//                "\"list\":[" +
//                "{\"key\":\"value\"}," +
//                "{\"key2\":\"value2\"}" +
//                "]" +
//                "}";
//        JsonNode jsonNode = mapper.readTree(json);
//        // 通过json的key获取value的JsonNode对象
//        JsonNode name = jsonNode.get("list");
//        // JsonNode 获取该节点的json字符串
//        String s = name.toString();
//        // 或将该节点转化为某值
//        String s1 = name.asText();
    }
}
