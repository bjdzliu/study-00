package com.ibmce.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {
    @Value("${apikey}")
    private String APIKEY;

    @Value("${tokenurl}")
    private String tokenurl ;

    @Value("${watsonurl}")
    private String watsonmlurl;


    @ResponseBody
    @RequestMapping("fileUpload.do")
    public String fileUpload(MultipartFile headPhoto, HttpServletRequest req) throws IOException {
        // 指定文件存储目录
        String realPath = req.getServletContext().getRealPath("/upload");
        File dir = new File(realPath);
        // 如果不存在则创建目录
        if(!dir.exists()){
            dir.mkdirs();
        }
        // 获取文件名
        String originalFilename = headPhoto.getOriginalFilename();
        // 文件存储位置
        File file =new File(dir,originalFilename);
        //  文件保存
        headPhoto.transferTo(file);

        // 初始化HttpClient，将csv文件名传入
        HttpClientCE conn = new HttpClientCE();
        conn.setAPIKEY(APIKEY);
        conn.setTokenurl(tokenurl);
        conn.setWatsonmlurl(watsonmlurl);
        conn.setFileName(file.toString());

        conn.accessibm();
        System.out.println("httpclientCE's result is "+conn.httpResult);

        return "OK";
    }
}