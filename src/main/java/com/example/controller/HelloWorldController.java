package com.example.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;
@Slf4j
@RestController  
public class HelloWorldController {  

    public static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @ApiIgnore
    @RequestMapping("/")  
    public String helloworld(){  
        logger.info("helloworld info...");
        logger.debug("helloworld debug...");
        return "Hello world!";
    }  

    @ApiOperation(value = "hello ....", notes = "note: hello")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "name", value = "名字", defaultValue = "nameX", required = true, dataType = "String", paramType = "path"),
        @ApiImplicitParam(name = "age", value = "年龄", defaultValue = "22", required = true, dataType = "int", paramType = "path")
    })
    @ApiResponses({
        @ApiResponse(code = 400, message = "test400")
    })
    @RequestMapping(value = "/hello/{name}/{age}", method = RequestMethod.GET)
    public String hellName(@PathVariable String name, @PathVariable int age){
        log.info("name={}, age={}",name, age);
        return "Hello "+name+" , "+age;
    }  
}  