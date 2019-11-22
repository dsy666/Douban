package com.example.Douban.pojo;

public class BookReview {
    private Integer id;
    private Integer book_id;
    private String user_name;
    private String user_icon;
    private String content;
    private Integer useful_count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_icon() {
        return user_icon;
    }

    public void setUser_icon(String user_icon) {
        this.user_icon = user_icon;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUseful_count() {
        return useful_count;
    }

    public void setUseful_count(Integer useful_count) {
        this.useful_count = useful_count;
    }

    @Override
    public String toString() {
        return "BookReview{" +
                "id=" + id +
                ", book_id=" + book_id +
                ", user_name='" + user_name + '\'' +
                ", user_icon='" + user_icon + '\'' +
                ", content='" + content + '\'' +
                ", useful_count=" + useful_count +
                '}';
    }
}
