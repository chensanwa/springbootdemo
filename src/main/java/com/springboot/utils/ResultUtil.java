package com.springboot.utils;

import com.springboot.domain.Result;

/**
 * @program: springboot
 * @description:
 * @author: Mr.Chen
 * @create: 2018-05-07 18:52
 **/
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("请求成功");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }


    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
