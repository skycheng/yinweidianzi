package com.example.demo.controller;
import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
 
@Controller
public class UploadFileController3 {
 
	
    /**
     * 实现文件上传
     * */
    @RequestMapping(value="fileUpload3",method = RequestMethod.POST)
    @ResponseBody 
    public String fileUpload(MultipartFile file){
    	
        if(file.isEmpty()){
            return "false";
        }
        String fileName = file.getOriginalFilename();
        
        String path = Utils.getPath() ;
        File dest = new File(path + "/" + fileName);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            return "/uploadPdf" + "/" + fileName;
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
