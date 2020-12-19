package ruoxijun.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Msg {
    private int code;
    private Map<String,Object> msg = new HashMap<>();
    public Msg addMsg(String key,Object value){
        msg.put(key,value);
        return this;
    }
}
