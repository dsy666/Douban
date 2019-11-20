package com.example.Douban.mapper;

import com.example.Douban.pojo.Music;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicMapper {

    List<Music> selectTop50();

    Music selectById(Integer id);
}