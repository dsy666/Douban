package com.example.Douban.mapper;

import com.example.Douban.pojo.FilmEssay;

import java.util.List;

public interface FilmEssayMapper {
    List<FilmEssay> selectfilmEssay(Integer id);
}
