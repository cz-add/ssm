package com.zking.ssm.controller;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;
import com.aliyun.oss.model.PutObjectResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.SocketTimeoutException;

@Controller
public class UploadController {
    String saveDir="C:\\Users\\chenz\\Pictures\\QQ浏览器截图";
    @RequestMapping("/toUpload")
    public  String toUpload(){
        return  "upload";
    }
@RequestMapping("/upload")
    public  String upload(MultipartFile img)throws  Exception{
    String path=saveDir+ File.separator+System.currentTimeMillis();
        System.out.println(path);
        File file=new File(path);
        img.transferTo(file);
        return  "redirect:/toUpload";
    }

    @RequestMapping("/uploads")
    public  String uploads(MultipartFile[] imgs)throws  Exception{
        for (int i=0;null!=imgs&&i<imgs.length;i++){
            String path=saveDir+ File.separator+System.currentTimeMillis();
            System.out.println(path);
            File file=new File(path);
            imgs[i].transferTo(file);
        }
        return  "redirect:/toUpload";
    }


}
