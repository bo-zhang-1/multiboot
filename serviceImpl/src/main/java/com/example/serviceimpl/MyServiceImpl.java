package com.example.serviceimpl;

import com.example.service.MyService;

/**
 * @Author: bo zhang
 * @Description:
 * @Date:Create：in 2018-10-07 20:04
 * @Modified By：暂无
 */
public class MyServiceImpl implements MyService {
    @Override
    public String sayHellow() {
      return "hellow module spring boot "  ;
    }
}
