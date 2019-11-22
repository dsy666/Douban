package com.example.Douban.mapper;

import com.example.Douban.pojo.BookReview;

import java.util.List;

public interface BookReviewMapper {

    public List<BookReview> selBookReviewById(Integer id);

}
