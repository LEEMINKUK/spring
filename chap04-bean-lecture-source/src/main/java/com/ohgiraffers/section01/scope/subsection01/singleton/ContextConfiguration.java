package com.ohgiraffers.section01.scope.subsection01.singleton;


import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread(){
        return new Bread("붕아빵",1000, new Date());
    }

    @Bean
    public Product milk(){
        return new Beverage("딸기우유",1500,500);
    }

    @Bean
    public Product water(){
        return new Beverage("암반수",3000,500);
    }

    @Bean
    @Scope("singleton")  // 기본적으로 싱글톤으로 설정 되어있다.
    public ShoppingCart cart(){
        return new ShoppingCart();
    }
}
