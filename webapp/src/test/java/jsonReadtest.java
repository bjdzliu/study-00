import java.io.*;
import java.util.ArrayList;

public class jsonReadtest {
    public String jsonRead(){
        File f = new File("/Users/qingliu/00-Study/java/webapp/src/test/java/line.txt");
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(f);
            //FileInputStream fis= new FileInputStream(f);
            BufferedReader br = new BufferedReader(fr);
            String str;
            while((str=br.readLine())!=null){
                System.out.println(str);
                arrayList.add(str);
            }
//            int n = fr.read();
//            System.out.println(n);
            br.close();


        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "aaa";
    }


    public static int[] toArrayByFileReader(String name){

        int[] array = new int[5];
        for(int i=0;i<4;i++){
            array[i]=1;
        }
        return array;
    }

    public static void main(String[] args) {
        //按行读取
        jsonReadtest j = new jsonReadtest();
        System.out.println(j.jsonRead());

        int[] array = toArrayByFileReader("test");
        System.out.println(array);

    }


}