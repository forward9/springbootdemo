package com.example.controller;

import com.example.vo.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 *
 @Controller
 @ResponseBody
 等于@RestController

 */
@Slf4j
@RestController
@RequestMapping("/index")
public class HelloController {

    @Resource
    private Environment env;

    @ApiOperation(value = "say" , notes = "note say")
//    @ApiImplicitParam(name = "", value = "无输入参数",required = true, dataType = "")
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(){
        log.info("say()...");
        return "say hello";

    }

    @ApiIgnore
    @RequestMapping("/user")
    public User getUser(){
        User user = new User();
        user.setId(11L);
        user.setName("11name");
        user.setAge(11);
        log.debug("user={}", user);
        log.debug("testXX={}", env.getProperty("testXX"));
        return user;
    }
}
