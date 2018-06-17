package com.springboot.repository;

import com.springboot.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: springboot
 * @description:
 * @author: Mr.Chen
 * @create: 2018-05-06 19:44
 **/
public interface GirlRepository extends JpaRepository<Girl,Integer>{

}
