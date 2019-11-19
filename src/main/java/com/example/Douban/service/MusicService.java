package com.example.Douban.service;

import com.example.Douban.mapper.MusicMapper;
import com.example.Douban.pojo.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicMapper musicMapper;

    public List<Music> findTop50() {
        List<Music> musics = musicMapper.selectTop50();
        for(Music music : musics){
            System.out.println(music);
        }
        return musics;
    }
}
