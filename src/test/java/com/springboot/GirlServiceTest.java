package com.springboot;

import com.springboot.domain.Girl;
import com.springboot.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: springboot
 * @description: service测试
 * @author: Mr.Chen
 * @create: 2018-05-07 21:02
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findOneTest(){
        Integer id = 5;
        Girl girl = girlService.findOne(id);
        Assert.assertEquals(new Integer(18),girl.getAge());
    }

}
