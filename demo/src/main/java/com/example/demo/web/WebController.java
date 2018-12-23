package com.example.demo.web;

import com.example.demo.entity.VerfifyCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.image.BufferedImage;
import java.io.*;

/**
 * @program: demo
 * @Date: 2018/12/20 22:57
 * @Author: 王鹏
 * @Description:
 */
@Controller
@RequestMapping("/demo")
public class WebController {


 @Autowired
 private VerfifyCode verfifyCode;

 @RequestMapping("/toIndex")
 public String toindex(){

  return "index";
 }

 @RequestMapping("/toReg")
 public String toReg(){
  return "reg";
 }

 @RequestMapping("/toProtocol")
 public String toProtocol(){
  return "protocol";
 }

 @RequestMapping("/getCode")
public String getCode(){
  ByteArrayOutputStream out = new ByteArrayOutputStream();

  BufferedImage verfifyCodeImage = verfifyCode.getImage();
  String text = verfifyCode.getText();
  verfifyCode.output(verfifyCodeImage,out);
  return "reg";
}


}
