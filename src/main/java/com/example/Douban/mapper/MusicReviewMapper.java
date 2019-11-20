package com.example.Douban.mapper;

import com.example.Douban.pojo.MusicReview;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicReviewMapper {

    List<MusicReview> selectTop10(Integer id);

}