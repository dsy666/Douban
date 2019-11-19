package com.example.Douban.service;

import com.example.Douban.mapper.FilmDetailMapper;
import com.example.Douban.pojo.Film;
import com.example.Douban.pojo.FilmDetail;
import com.example.Douban.pojo.FilmDetailParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmDetailService {
    @Autowired
    FilmDetailMapper filmDetailMapper;
    public List<FilmDetail> selectMessageById(String id,Integer limitnum){
        FilmDetailParam filmDetailParam = new FilmDetailParam();
        filmDetailParam.setId(id);
        filmDetailParam.setLimitnum(limitnum);
        return filmDetailMapper.selectMessageById(filmDetailParam);
    }
}
