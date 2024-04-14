package com.ohgiraffers.section01.autowired.subsection01.field;


import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/* @Service : @Component 의 세분화 어노테이션의 한 종류로 Service 계층에서 사용한다. */
@Service("bookServiceField")
public class BookService {

    @Autowired // 필드주입  (final 키워드를 붙일수 없다. 그래서 권장하지 않는다.)
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBook(){

        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence){

        return bookDAO.selectOneBook(sequence);
    }
}
