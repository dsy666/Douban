package com.example.Douban.service;

import com.example.Douban.mapper.MusicMapper;
import com.example.Douban.mapper.MusicReviewMapper;
import com.example.Douban.pojo.Music;
import com.example.Douban.pojo.MusicDetail;
import com.example.Douban.pojo.MusicReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicMapper musicMapper;

    @Autowired
    private MusicReviewMapper reviewMapper;

    public List<Music> findTop50() {
        List<Music> musics = musicMapper.selectTop50();
        for(Music music : musics){
            System.out.println(music);
        }
        return musics;
    }

    public MusicDetail selectDetail(Integer id){

        List<MusicReview> reviews = reviewMapper.selectTop10(id);

        Music music = musicMapper.selectById(id);

        MusicDetail musicDetail = new MusicDetail(music,reviews);

        return musicDetail;
    }
}
