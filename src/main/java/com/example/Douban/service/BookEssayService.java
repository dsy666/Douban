package com.example.Douban.service;

import com.example.Douban.mapper.BookEssayMapper;
import com.example.Douban.pojo.BookEssay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookEssayService {

    @Autowired
    BookEssayMapper bookEssayMapper;

    public List<BookEssay> selBookEssayById(Integer id){
        return bookEssayMapper.selBookEssayById(id);
    }
}
