package com.example.Douban.mapper;

import com.example.Douban.pojo.FilmDetail;
import com.example.Douban.pojo.FilmDetailParam;

import java.util.List;

public interface FilmDetailMapper {
    List<FilmDetail> selectMessageById(FilmDetailParam filmDetailParam);
}
