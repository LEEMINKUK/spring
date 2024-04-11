package com.ohgiraffers.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


// @Repository 도 사용 가능 한데 의존성 주입?
@Component // 이 클래스가 bean 클래스임을 설정   (이름을 설정 하지 않으면 소문자로 변환해서 class 명을 아이디로 갖는다)
public class MemberDAO {

    private final Map<Integer,MemberDTO> memberMap;

    public MemberDAO (){
        memberMap = new HashMap<>();

        memberMap.put(1, new MemberDTO(1, "user01", "pass01","홍길동"));
        memberMap.put(2, new MemberDTO(2, "user02", "pass02","유관순"));
    }

    public MemberDTO selectMember(int sequence){

        return memberMap.get(sequence);
    }

    public boolean insertMember(MemberDTO newMember){

        int before = memberMap.size();

        memberMap.put(newMember.getSequence(), newMember);

        int after = memberMap.size();

        return after > before? true:false;
    }
}
