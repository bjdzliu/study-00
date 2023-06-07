import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.List;

public class testJson {
    public static void main(String[] args) {
        JSONObject objectjson = new JSONObject();
        //string
        objectjson.put("string","string");
        //int
        objectjson.put("int",2);
        //boolean
        objectjson.put("boolean",true);
        //array
        List<Integer> integers = Arrays.asList(1,2,3);
        objectjson.put("list",integers);
        //null
        objectjson.put("null",null);

        System.out.println(objectjson);

    }


}
