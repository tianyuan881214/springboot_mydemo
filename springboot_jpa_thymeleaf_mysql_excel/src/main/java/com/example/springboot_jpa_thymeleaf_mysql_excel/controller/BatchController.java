package com.example.springboot_jpa_thymeleaf_mysql_excel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class BatchController {
    @PostMapping("/batchImport")
    @ResponseBody
    public String batchImport(@RequestParam(value = "filename") MultipartFile file, HttpServletRequest request, HttpServletResponse response){
        return null;
    }
}
