package com.ohgiraffers.section02.initdestroy.subsection02.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Owner {


    /* init-method 와 같은 설정 어노테이션 이다. */
    @PostConstruct
    public void openShop(){
        System.out.println("가게 오픈 , 쇼핑 하세요~");
    }




    /* destroy-method 와 같은 설정 어노테이션 이다.*/
    @PreDestroy
    public void closeShop(){
        System.out.println("가게 클로즈, 쇼핑 불가 입니다~");
    }
}
