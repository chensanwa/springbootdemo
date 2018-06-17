package com.springboot.exception;

import com.springboot.enums.ResultEnum;

/**
 * @program: springboot
 * @description: 自定义异常类
 * @author: Mr.Chen
 * @create: 2018-05-07 20:46
 **/
public class GirlException extends RuntimeException {

    private Integer code;

    public GirlException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
