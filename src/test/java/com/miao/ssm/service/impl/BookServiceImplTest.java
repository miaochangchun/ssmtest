package com.miao.ssm.service.impl;

import com.miao.ssm.BaseTest;
import com.miao.ssm.dto.AppointExecution;
import com.miao.ssm.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by 10048 on 2017/10/17.
 */
public class BookServiceImplTest extends BaseTest {
    @Autowired
    private BookService bookService;

    @Test
    public void getById() throws Exception {

    }

    @Test
    public void getList() throws Exception {

    }

    @Test
    public void appoint() throws Exception {
        long bookId = 1001;
        long studentId = 12345678910L;
        AppointExecution execution = bookService.appoint(bookId, studentId);
        System.out.println(execution);
    }

}