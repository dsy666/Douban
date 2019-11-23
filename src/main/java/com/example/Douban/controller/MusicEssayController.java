package com.example.Douban.controller;

import com.example.Douban.pojo.Music;
import com.example.Douban.pojo.MusicDetail;
import com.example.Douban.pojo.MusicEssay;
import com.example.Douban.service.MusicEssayService;
import com.example.Douban.service.MusicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation (value = "获取音乐评论详情",notes = "根据乐评id获取乐评详情信息")
    @ApiImplicitParam (name = "essayid",value = "乐评id",dataType = "Integer",required = true)
    @GetMapping ("/detail/{id}")
    public MusicEssay selectDetail(@PathVariable() Integer id){
        MusicEssay musicEssay = essayService.selectById(id);

        return musicEssay;
    }
}
