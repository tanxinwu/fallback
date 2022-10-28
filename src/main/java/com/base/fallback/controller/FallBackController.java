package com.base.fallback.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback/")
public class FallBackController {

    @RequestMapping(value = "err",method = RequestMethod.GET)
    public String err(){
        return "请求失败，快速返回";
    }
}
