package com.example.Douban.pojo;

import java.util.Date;

public class FilmEssay {
    private Integer id;
    private Integer movie_id;
    private String title;
    private String user_icon;
    private String user_name;
    private String content;
    private Date discuss_date;
    private Integer useful_count;
    private Integer unuseful_count;
    private Integer reply_count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Integer movie_id) {
        this.movie_id = movie_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUser_icon() {
        return user_icon;
    }

    public void setUser_icon(String user_icon) {
        this.user_icon = user_icon;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDiscuss_date() {
        return discuss_date;
    }

    public void setDiscuss_date(Date discuss_date) {
        this.discuss_date = discuss_date;
    }

    public Integer getUseful_count() {
        return useful_count;
    }

    public void setUseful_count(Integer useful_count) {
        this.useful_count = useful_count;
    }

    public Integer getUnuseful_count() {
        return unuseful_count;
    }

    public void setUnuseful_count(Integer unuseful_count) {
        this.unuseful_count = unuseful_count;
    }

    public Integer getReply_count() {
        return reply_count;
    }

    public void setReply_count(Integer reply_count) {
        this.reply_count = reply_count;
    }

    @Override
    public String toString() {
        return "FilmEssay{" +
                "id=" + id +
                ", movie_id=" + movie_id +
                ", title='" + title + '\'' +
                ", user_icon='" + user_icon + '\'' +
                ", user_name='" + user_name + '\'' +
                ", content='" + content + '\'' +
                ", discuss_date=" + discuss_date +
                ", useful_count=" + useful_count +
                ", unuseful_count=" + unuseful_count +
                ", reply_count=" + reply_count +
                '}';
    }
}
