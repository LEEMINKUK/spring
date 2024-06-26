package com.ohgiraffers.section02.initdestroy.subsection02.annotation;


import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
@ComponentScan("com.ohgiraffers.section02.initdestroy.subsection02.annotation")
public class ContextConfiguration {

    @Bean
    public Product carpBread(){
        return new Bread("붕어빵",2000,new Date());
    }
    @Bean
    public Product milk(){
        return new Beverage("우유",2000,500);
    }
    @Bean
    public Product water(){
        return new Beverage("에비앙",5000,500);
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }

}
