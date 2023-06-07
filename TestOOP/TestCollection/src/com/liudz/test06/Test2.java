package com.liudz.test06;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if("cc".equals(it.next())){
                list.add("kk");

            }
        }

    }


}
