package com.example.Douban.service;

import com.example.Douban.mapper.FilmEssayMapper;
import com.example.Douban.pojo.FilmEssay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmEssayService {
    @Autowired
    FilmEssayMapper filmEssayMapper;
    public List<FilmEssay> selectfilmEssay(Integer id){
        return filmEssayMapper.selectfilmEssay(id);
    }
}
