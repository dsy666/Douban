package com.example.Douban.controller;

import com.example.Douban.pojo.Music;
import com.example.Douban.pojo.MusicDetail;
import com.example.Douban.pojo.MusicEssay;
import com.example.Douban.service.MusicEssayService;
import com.example.Douban.service.MusicService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("musicEssay")
public class MusicEssayController {

    @Autowired
    private MusicEssayService essayService;

    @GetMapping ("/detail/{id}")
    public MusicEssay selectDetail(@PathVariable() Integer id){
        MusicEssay musicEssay = essayService.selectById(id);

        return musicEssay;
    }
}
