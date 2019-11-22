package com.example.Douban.mapper;

import com.example.Douban.pojo.Book;

import java.util.List;

public interface BookReviewMapper {

    public List<Book> selBookReviewById(Integer id);

}
