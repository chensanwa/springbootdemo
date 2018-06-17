package com.springboot.service;

import com.springboot.domain.Girl;
import com.springboot.enums.ResultEnum;
import com.springboot.exception.GirlException;
import com.springboot.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: springboot
 * @description:
 * @author: Mr.Chen
 * @create: 2018-05-07 16:54
 **/
@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(17);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("B");
        girlB.setAge(17);
        girlRepository.save(girlB);
    }

    public void getAge(Integer id){
        Girl girl = girlRepository.getOne(id);
        Integer age = girl.getAge();
        if (age < 10){
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        } else if (age > 10 && age < 16){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
        //....
    }

    /**
     * 通过ID查询
     * @param id
     * @return
     */
    public Girl findOne(Integer id){
        return girlRepository.getOne(id);
    }
}
