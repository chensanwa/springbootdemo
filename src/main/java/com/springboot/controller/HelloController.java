package com.springboot.controller;

import com.springboot.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: springboot
 * @description:
 * @author: Mr.Chen
 * @create: 2018-05-06 18:23
 **/
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = {"/say"},method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(){
        return girlProperties.getCupSize();
    }

    /**
     * 请求参数名称为"id",是否必传为false，默认值为0
     * @param myId
     * @return
     */
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String testParam(@RequestParam(value = "id",required = false,defaultValue = "0")Integer myId){
        return "id:"+ myId;
    }

}
