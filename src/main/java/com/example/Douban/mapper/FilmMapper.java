package com.example.Douban.mapper;

import com.example.Douban.pojo.Film;
import com.example.Douban.pojo.FilmParam;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.Date;
import java.util.List;

public interface FilmMapper {
    List<Film> selectFromTimeAndArea(FilmParam fact);
}
