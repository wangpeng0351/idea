package com.example.demo.web;

import com.example.demo.Utils.getCode;
import com.example.demo.entity.ReturnContant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @program: demo
 * @Date: 2018/12/20 22:57
 * @Author: 王鹏
 * @Description:
 */
@Controller
@RequestMapping("/demo")
public class WebController {

 @Resource
 private ReturnContant returnContant;

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



 /**
  * 根据获取到的手机号发送验证码
  * @param request
  * @param phone 获取的手机号码
  * @return
  */
 @RequestMapping(value="/sendSMS",method= RequestMethod.POST)
 public @ResponseBody ReturnContant sendSMS(HttpServletRequest request, String phone){
  //根据获取到的手机号发送验证码
  String code= getCode.getCode(phone);
  returnContant.setStatus(1);
  returnContant.setData(code);
  return returnContant;
 }
}
