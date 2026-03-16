package com.it.controller;

import com.it.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Slf4j
@RestController
public class UploadController {

    @PostMapping("/upload")
    public Result upload(String name, Integer age, MultipartFile file) throws IOException {
        log.info("接收参数: {},{},{}", name, age, file);
        String extension=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString()+ extension;
        file.transferTo(new File("D:/images/"+newFileName ));
        return Result.success();
    }

}