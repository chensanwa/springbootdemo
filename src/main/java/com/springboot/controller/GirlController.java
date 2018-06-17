package com.springboot.controller;

import com.springboot.domain.Girl;
import com.springboot.domain.Result;
import com.springboot.repository.GirlRepository;
import com.springboot.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @program: springboot
 * @description:
 * @author: Mr.Chen
 * @create: 2018-05-06 19:32
 **/
@RestController
public class GirlController {

    private final Logger logger = LoggerFactory.getLogger(GirlController.class);


    @Autowired
    private GirlRepository girlRepository;

    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
//        System.out.println("get girlList().........");
        logger.info("---------------get girlList()--------------");
        return girlRepository.findAll();
    }

    @PostMapping(value = "/girls")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }

        girl.setCupSize(girl.getCupSize());
        girl.setAge(girl.getAge());
        return ResultUtil.success(girlRepository.save(girl));
    }

    @GetMapping(value = "/girls/getAge/{id}")
    public void getAge(@PathVariable("id")Integer id){

    }
}
