package com.example.Douban.mapper;

import com.example.Douban.pojo.BookEssay;

import java.util.List;

public interface BookEssayMapper {
    List<BookEssay> selBookEssayById(Integer id);
}
