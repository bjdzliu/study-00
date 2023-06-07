package com.ibmce.controller;
import com.alibaba.druid.support.json.JSONUtils;

import java.io.*;

public class jsonRead {
    public jsonRead(){
        File f = new File("german_risk_data_json.txt");
        try {
            FileReader fr = new FileReader(f);
            int n = fr.read();
            System.out.println(n);
            fr.close();

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
