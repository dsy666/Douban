package com.example.Douban.controller;

import com.example.Douban.pojo.Book;
import com.example.Douban.pojo.BookEssay;
import com.example.Douban.service.BookEssayService;
import com.example.Douban.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class BookController<BookReview> {

    @Autowired
    BookService bookService;

    @Autowired
    BookEssayService bookEssayService;

    @GetMapping("/book")
    public List<Book> showBook(){
        List<Book> listbooks=bookService.selectBook();
        return listbooks;
    }

    @GetMapping ("/bookEssay")
    public List<BookEssay> showBookEssay(){
        List<BookEssay> listBookEssay=bookEssayService.selBookEssayById(1000016);
        return  listBookEssay;
    }
}
