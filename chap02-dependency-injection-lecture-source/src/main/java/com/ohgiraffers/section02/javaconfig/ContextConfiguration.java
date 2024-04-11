package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator(){

        return new PersonalAccount("110-123-1231230",1000);
    }

    @Bean
    public MemberDTO memberGenerator(){

        /* 1. 생성자 주입 */
//        return new MemberDTO(1, "홍길동", "010-1234-1234", "emas@email.com", accountGenerator());

        /* 2. setter 주입*/
        MemberDTO member = new MemberDTO();

        member.setSequence(1);
        member.setName("유관순");
        member.setPhone("010-1234-6666");
        member.setEmail("EEEE@email.com");
        /* setter 를 통해 Account 를 생성하는 메소드를 호출한 리턴값을 전달하여 bean 을 조립할 수 있다. */
        member.setPersonalAccount(accountGenerator());

        return member;
    }
}
