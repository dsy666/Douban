package com.example.Douban.controller;

import com.example.Douban.pojo.Book;
import com.example.Douban.pojo.BookEssay;
import com.example.Douban.pojo.BookReturn;
import com.example.Douban.pojo.BookReview;
import com.example.Douban.service.BookEssayService;
import com.example.Douban.service.BookReviewService;
import com.example.Douban.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    BookEssayService bookEssayService;

    @Autowired
    BookReviewService bookReviewService;

    @RequestMapping("/book")
    public List<Book> showBook(){
        List<Book> listbooks=bookService.selectBook();
        return listbooks;
    }

    @RequestMapping("/bookEssay")
    public List<BookEssay> showBookEssay(){
        List<BookEssay> listBookEssay=bookEssayService.selBookEssayById(1000016);
        return  listBookEssay;
    }

    @RequestMapping("/bookReview")
    public List<BookReview> showBookReview(){
        return bookReviewService.selBookReviewById(1002299);
    }

}
