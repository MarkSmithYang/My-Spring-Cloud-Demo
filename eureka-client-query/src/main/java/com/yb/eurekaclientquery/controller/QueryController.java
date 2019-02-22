package com.yb.eurekaclientquery.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * author biaoyang
 * date 2019/2/14 001415:48
 */
@RestController
@CrossOrigin
public class QueryController {

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }

}
