package com.ibmce.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class HttpClientCE {
    String fileName;
    String httpResult;
    private String APIKEY;
    private String tokenurl ;
    private String watsonmlurl;

    public void setAPIKEY(String APIKEY) {
        this.APIKEY = APIKEY;
    }

    public void setTokenurl(String tokenurl) {
        this.tokenurl = tokenurl;
    }

    public void setWatsonmlurl(String watsonmlurl) {
        this.watsonmlurl = watsonmlurl;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public  HttpClientCE(){
    }

    @RequestMapping(value = "/accessibmcloud", method={RequestMethod.GET,RequestMethod.POST})
    public  void accessibm() throws IOException {
        // NOTE: you must manually set API_KEY below using information retrieved from your IBM Cloud account.

        HttpURLConnection tokenConnection = null;
        HttpURLConnection scoringConnection = null;
        BufferedReader tokenBuffer = null;
        BufferedReader scoringBuffer = null;
        // String API_KEY = "<your API key>";

        String API_KEY = "8WDHrNXi1hz_5t_sI5Ep1NPHdKDENulw_oNr-DCN4mKa";
        System.out.println("get apikey from apikey.properties:  "+APIKEY);


        try {
        // Getting IAM token
           URL tokenUrl = new URL(tokenurl + APIKEY);
            tokenConnection = (HttpURLConnection) tokenUrl.openConnection();
            tokenConnection.setDoInput(true);
            tokenConnection.setDoOutput(true);
            tokenConnection.setRequestMethod("POST");
            tokenConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            tokenConnection.setRequestProperty("Accept", "application/json");
            tokenBuffer = new BufferedReader(new InputStreamReader(tokenConnection.getInputStream()));
            StringBuffer jsonString = new StringBuffer();
            String line;
            while ((line = tokenBuffer.readLine()) != null) {
                jsonString.append(line);
            }

            System.out.println("already get token");
            // Scoring request
            //URL scoringUrl = new URL("https://us-south.ml.cloud.ibm.com/ml/v4/deployments/a8b9714b-bb82-48dd-8f53-fa6c1130f8f4/predictions?version=2022-09-22");
            URL scoringUrl = new URL(watsonmlurl);

            String iam_token = "Bearer " + jsonString.toString().split(":")[1].split("\"")[1];
            scoringConnection = (HttpURLConnection) scoringUrl.openConnection();
            scoringConnection.setDoInput(true);
            scoringConnection.setDoOutput(true);
            scoringConnection.setRequestMethod("POST");
            scoringConnection.setRequestProperty("Accept", "application/json");
            scoringConnection.setRequestProperty("Authorization", iam_token);
            scoringConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            OutputStreamWriter writer = new OutputStreamWriter(scoringConnection.getOutputStream(), "UTF-8");
            // NOTE: manually define and pass the array(s) of values to be scored in the next line
            //format: String payload = "{\"input_data\": [{\"fields\": [array_of_input_fields],\"values\": [array_of_values_to_be_scored, another_array_of_values_to_be_scored]}]}";
            String payload = "{\"input_data\":[{\"fields\":[\"CheckingStatus\",\"LoanDuration\",\"CreditHistory\",\"LoanPurpose\",\"LoanAmount\",\"ExistingSavings\",\"EmploymentDuration\",\"InstallmentPercent\",\"Sex\",\"OthersOnLoan\",\"CurrentResidenceDuration\",\"OwnsProperty\",\"Age\",\"InstallmentPlans\",\"Housing\",\"ExistingCreditsCount\",\"Job\",\"Dependents\",\"Telephone\",\"ForeignWorker\"],\"values\":[[\"0_to_200\",31,\"credits_paid_to_date\",\"other\",1889,\"100_to_500\",\"less_1\",3,\"female\",\"none\",3,\"savings_insurance\",32,\"none\",\"own\",1,\"skilled\",1,\"none\",\"yes\"],[\"less_0\",18,\"credits_paid_to_date\",\"car_new\",462,\"less_100\",\"1_to_4\",2,\"female\",\"none\",2,\"savings_insurance\",37,\"stores\",\"own\",2,\"skilled\",1,\"none\",\"yes\"],[\"less_0\",15,\"prior_payments_delayed\",\"furniture\",250,\"less_100\",\"1_to_4\",2,\"male\",\"none\",3,\"real_estate\",28,\"none\",\"own\",2,\"skilled\",1,\"yes\",\"no\"],[\"0_to_200\",28,\"credits_paid_to_date\",\"retraining\",3693,\"less_100\",\"greater_7\",3,\"male\",\"none\",2,\"savings_insurance\",32,\"none\",\"own\",1,\"skilled\",1,\"none\",\"yes\"],[\"no_checking\",28,\"prior_payments_delayed\",\"education\",6235,\"500_to_1000\",\"greater_7\",3,\"male\",\"none\",3,\"unknown\",57,\"none\",\"own\",2,\"skilled\",1,\"none\",\"yes\"],[\"no_checking\",32,\"outstanding_credit\",\"vacation\",9604,\"500_to_1000\",\"greater_7\",6,\"male\",\"co-applicant\",5,\"unknown\",57,\"none\",\"free\",2,\"skilled\",2,\"yes\",\"yes\"],[\"no_checking\",9,\"prior_payments_delayed\",\"car_new\",1032,\"100_to_500\",\"4_to_7\",3,\"male\",\"none\",4,\"savings_insurance\",41,\"none\",\"own\",1,\"management_self-employed\",1,\"none\",\"yes\"],[\"less_0\",16,\"credits_paid_to_date\",\"vacation\",3109,\"less_100\",\"4_to_7\",3,\"female\",\"none\",1,\"car_other\",36,\"none\",\"own\",2,\"skilled\",1,\"none\",\"yes\"],[\"0_to_200\",11,\"credits_paid_to_date\",\"car_new\",4553,\"less_100\",\"less_1\",3,\"female\",\"none\",3,\"savings_insurance\",22,\"none\",\"own\",1,\"management_self-employed\",1,\"none\",\"yes\"],[\"no_checking\",35,\"outstanding_credit\",\"appliances\",7138,\"500_to_1000\",\"greater_7\",5,\"male\",\"co-applicant\",4,\"unknown\",49,\"none\",\"free\",2,\"skilled\",2,\"yes\",\"yes\"],[\"less_0\",5,\"all_credits_paid_back\",\"car_new\",1523,\"less_100\",\"unemployed\",2,\"female\",\"none\",2,\"real_estate\",19,\"none\",\"rent\",1,\"management_self-employed\",1,\"none\",\"yes\"]]}]}";

            /*
            开始测试代码
             */

            System.out.println("start UnivocityReadCsv");

            UnivocityReadCsv readCsv = new UnivocityReadCsv();
            List<String[]> list = readCsv.parseCSV(fileName);
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
            String payloadnew=JSON.toJSONString(mainjson);

            /*
            结束测试代码
             */

            System.out.println("start write payload");
            writer.write(payloadnew);
            writer.close();
            scoringBuffer = new BufferedReader(new InputStreamReader(scoringConnection.getInputStream()));
            StringBuffer jsonStringScoring = new StringBuffer();
            String lineScoring;
            while ((lineScoring = scoringBuffer.readLine()) != null) {
                jsonStringScoring.append(lineScoring);
            }
            System.out.println(jsonStringScoring);
            httpResult="success";
        } catch (IOException e) {
            System.out.println("The URL is not valid.");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
        finally {
            if (tokenConnection != null) {
                tokenConnection.disconnect();
            }
            if (tokenBuffer != null) {
                tokenBuffer.close();
            }
            if (scoringConnection != null) {
                scoringConnection.disconnect();
            }
            if (scoringBuffer != null) {
                scoringBuffer.close();
            }
        }
    }
}