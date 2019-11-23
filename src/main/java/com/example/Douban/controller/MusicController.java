package com.example.Douban.controller;

import com.example.Douban.pojo.Music;
import com.example.Douban.pojo.MusicDetail;
import com.example.Douban.service.MusicService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api ("电影操作接口")
@RestController
@RequestMapping("music")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping ("/rankingList")
    public List<Music> rankingList(){
        List<Music> musicList =musicService.findTop50();

        return musicList;
    }

    @GetMapping("/detail/{id}")
    public MusicDetail selectDetail(@PathVariable() Integer id){
        MusicDetail musicDetail =musicService.selectDetail(id);

        return musicDetail;
    }
}
