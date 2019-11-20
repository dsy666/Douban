package com.example.Douban.pojo;

import java.util.List;

/**
 * 用于存储一个音乐的详情页信息
 */
public class MusicDetail {
    private Music music;
    private List<MusicReview> reviews;

    public MusicDetail(Music music, List<MusicReview> reviews) {
        this.music = music;
        this.reviews = reviews;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setReviews(List<MusicReview> reviews) {
        this.reviews = reviews;
    }

    public Music getMusic() {
        return music;
    }

    public List<MusicReview> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "MusicDetail{" +
                "music=" + music +
                ", reviews=" + reviews +
                '}';
    }
}
