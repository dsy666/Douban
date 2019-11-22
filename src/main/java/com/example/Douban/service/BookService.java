package com.example.Douban.service;

import com.example.Douban.mapper.BookMapper;
import com.example.Douban.pojo.Book;
import com.example.Douban.pojo.BookReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookMapper bookmapper;

    public List<Book> selectBook() {
        return bookmapper.selectBook();
    }

}
