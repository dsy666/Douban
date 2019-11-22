package com.example.Douban.controller;

import com.example.Douban.pojo.Book;
import com.example.Douban.pojo.BookEssay;
import com.example.Douban.pojo.BookReturn;
import com.example.Douban.service.BookEssayService;
import com.example.Douban.service.BookReviewService;
import com.example.Douban.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/book")
    public List<BookReturn> showBook(){
        List<BookReturn> listbook=bookService.selectBook();
        return listbook;
    }

    @GetMapping("/bookEssay")
    public List<BookEssay> showBookEssay(){
        List<BookEssay> listBookEssay=bookEssayService.selBookEssayById(1000016);
        return  listBookEssay;
    }

    @GetMapping("/bookReview")
    public List<Book> showBookReview(){
        List<Book> listBookReview=bookReviewService.selBookReviewById(1002299);
        return listBookReview;
    }

}
