package com.ohgiraffers.section03.annotationconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/* ComponentScan : base package 로 설정 된 하위 경로에 특정 어노테이션을 가지고 있는 클래스를 bean 으로 등록하는 기능
*                  @Component 어노테이션이 작성 된 클래스를 인식하여 bean 으로 등록한다.
*                   특수 목적에 따라 세부 기능을 제공하는 @Controller, @Service, @Repository, @Configuration 등을 사용한다.
*  */
@Configuration
@ComponentScan(basePackages = "com.ohgiraffers") // 컴포넌트 검색 범위 설정. (기본 설정은 해당 클래스가 있는 패키지의 컴포넌트만 찾음.)
public class ContextConfiguration {
}
