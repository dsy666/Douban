package com.example.Douban.controller;

import com.example.Douban.pojo.Music;
import com.example.Douban.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @RequestMapping("/rankingList")
    public List<Music> rankingList(){
        List<Music> musicList =musicService.findTop50();

        return musicList;
    }
}
