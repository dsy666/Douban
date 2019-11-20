package com.example.Douban.service;

import com.example.Douban.mapper.MusicEssayMapper;
import com.example.Douban.mapper.MusicMapper;
import com.example.Douban.mapper.MusicReviewMapper;
import com.example.Douban.pojo.Music;
import com.example.Douban.pojo.MusicDetail;
import com.example.Douban.pojo.MusicEssay;
import com.example.Douban.pojo.MusicReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicEssayService {

    @Autowired
    private MusicEssayMapper essayMapper;


    public MusicEssay selectById(Integer id){
        MusicEssay musicEssay = essayMapper.selectEssay(id);
        System.out.println(musicEssay);
        return musicEssay;
    }
}
