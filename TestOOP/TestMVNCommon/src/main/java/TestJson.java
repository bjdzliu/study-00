import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;


public class TestJson {

    public static boolean isNumeric(String str){
        for (int i = str.length();--i>=0;){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }


    public static boolean isFloat(String str){
        if(str.indexOf('.') == 1){  //查到字符'.'，返回1。另外注意是单引号。
            System.out.println("find float");
            return true;
        }
        else{
            System.out.println("int or str");
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("sss");
        JSONObject sonjson = new JSONObject();


        List list1 = new ArrayList();
        List list2 = new ArrayList();

        list1.add("a");
        list1.add(1);
        list1.add("b");



        list2.add("a");
        list2.add(1);
        list2.add("b");

        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

        List list3 = new ArrayList();
        list3.add(list1);
        list3.add(list2);
        for(Object obj:list3){
            System.out.println(obj.getClass());
        }

        sonjson.put("fields","fieldslist2");
        sonjson.put("values",list3);
        System.out.println(sonjson);
        System.out.println(JSON.toJSONString(sonjson));

        String strn = "1111";
        String str = "0";
        String strfloat= "a";

       int n = Integer.parseInt(strn);
        System.out.println("Integer.parseInt(strn) : " + n);

        if(isNumeric(str)){
            System.out.println("ssss");
            int n2 = Integer.valueOf(str).intValue();
            System.out.println("Integer.parseInt(str) : " + n2);
        }

        if(isFloat(strfloat)){
            System.out.println("find");
        }else if(isNumeric(str)){
            System.out.println("find int");
        }else{

        }





//
//        //创建一个ArrayList集合，向这个集合中存入学生的成绩：
//        ArrayList al = new ArrayList();
//        al.add(98);
//        al.add(18);
//        al.add(39);
//        al.add(60);
//        al.add(83);
//        al.add("丽丽");
//        //对集合遍历查看：
//        for(Object obj:al){
//            System.out.println(obj);
//        }

    }

}
