package com.ohgiraffers.section01.aop;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true) // AOP 기능 활성화
/* Aspectj 의 autoProxy 사용에 관한 설정을 해 주어야 advice 가 동작한다. */
public class ContextConfiguration {

}
