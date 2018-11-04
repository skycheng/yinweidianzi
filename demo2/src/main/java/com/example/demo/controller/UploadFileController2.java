package com.example.demo.controller;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
 
@Controller
public class UploadFileController2 {
 
	
    /**
     * 实现文件上传
     * */
    @RequestMapping(value="fileUpload2",method = RequestMethod.POST)
    @ResponseBody 
    public String fileUpload(MultipartFile file){
    	
        if(file.isEmpty()){
            return "false";
        }
        String fileName = file.getOriginalFilename();
        
        String path = "D:/downloads/apache-tomcat-9.0.12/apache-tomcat-9.0.12/webapps/examples" + "/uploadFile" ;
        File dest = new File(path + "/" + fileName);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            return "http://localhost:8080/examples/uploadFile" + "/" + fileName;
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        }
    }
}
