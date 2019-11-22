package com.example.Douban.service;

import com.example.Douban.mapper.BookReviewMapper;
import com.example.Douban.pojo.BookReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookReviewService {
    @Autowired
    BookReviewMapper bookReviewMapper;

    public List<BookReview> selBookReviewById(Integer id){
        return bookReviewMapper.selBookReviewById(id);
    }
}
