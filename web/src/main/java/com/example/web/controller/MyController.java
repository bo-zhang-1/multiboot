package com.example.web.controller;

import com.example.service.MyService;
import com.example.serviceimpl.MyServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: bo zhang
 * @Description:
 * @Date:Create：in 2018-10-07 20:30
 * @Modified By：暂无
 */
@RestController
public class MyController  {


    @GetMapping("/")
    public String mytest()
    {
        MyService myService=new MyServiceImpl();
        return myService.sayHellow();
    }
}