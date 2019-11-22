package com.example.Douban.mapper;

import com.example.Douban.pojo.Book;
import com.example.Douban.pojo.BookReturn;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {

    List<Book> selectBook();
}
