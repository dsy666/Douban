package com.example.Douban.mapper;

import com.example.Douban.pojo.MusicEssay;
import org.springframework.stereotype.Repository;


@Repository
public interface MusicEssayMapper {

    MusicEssay selectEssay(Integer id);
}