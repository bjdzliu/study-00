package com.ibmce.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.univocity.parsers.common.processor.RowListProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnivocityReadCsv {
    public List<String[]> parseCSV(String fileName){
        //创建一个配置选项，用来提供多种配置选项
        CsvParserSettings parserSettings = new CsvParserSettings();
        //打开解析器的自动检测功能，让它自动检测输入中包含的分隔符
        parserSettings.setLineSeparatorDetectionEnabled(true);

        //创建RowListProcessor对象，用来把每个解析的行存储在列表中
        RowListProcessor rowListProcessor = new RowListProcessor();
        parserSettings.setProcessor(rowListProcessor);  //配置解析器
        //待解析的CSV文件包含标题头，把第一个解析行看作文件中每个列的标题
        parserSettings.setHeaderExtractionEnabled(true);
        parserSettings.setLineSeparatorDetectionEnabled(true);

        //创建CsvParser对象，用于解析文件
        CsvParser parser = new CsvParser(parserSettings);
        parser.parse(new File(fileName));

        //如果解析中包含标题，用于获取标题
        String[] headers = rowListProcessor.getHeaders();
        //获取行值，并遍历打印
        List<String[]> rows = rowListProcessor.getRows();
        /*for(int i = 0; i < rows.size(); i++){
            System.out.println(Arrays.asList(rows.get(i)));
        }*/
        return rows;
    }

    public static void main(String[] args) {
        UnivocityReadCsv readCsv = new UnivocityReadCsv();
        List<String[]> list = readCsv.parseCSV("/Users/qingliu/00-Study/java/webapp/src/test/java/csvfile.csv");
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(Arrays.asList(list.get(i)));
//
//        }
//create sub json
        List<String> fieldslist = Arrays.asList("CheckingStatus","LoanDuration","CreditHistory","LoanPurpose","LoanAmount","ExistingSavings","EmploymentDuration","InstallmentPercent","Sex","OthersOnLoan","CurrentResidenceDuration","OwnsProperty","Age","InstallmentPlans","Housing","ExistingCreditsCount","Job","Dependents","Telephone","ForeignWorker");
        JSONObject sonjson = new JSONObject();
        sonjson.put("fields",fieldslist);
        sonjson.put("values",list);
       // System.out.println(sonjson);


        //String sonjsonstr = JSON.toJSONString(sonjson);

        JSONObject mainjson = new JSONObject();
        List<JSONObject> mainlist = new ArrayList<>();
        mainlist.add(sonjson);
        mainjson.put("input_data",mainlist);
        System.out.println(JSON.toJSONString(mainjson));


    }
}