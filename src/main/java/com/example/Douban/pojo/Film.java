package com.example.Douban.pojo;

public class Film {
    private Integer id;
    private String name;
    private String director;
    private String scriptwriter;
    private String actor;
    private String genre;
    private String area;
    private Integer area_id;
    private String language;
    private String release_time;
    private String mins;
    private String alternate_name;
    private String imdb;
    private Float grade;
    private String review_num;
    private String essay_num;
    private String comment_num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getScriptwriter() {
        return scriptwriter;
    }

    public void setScriptwriter(String scriptwriter) {
        this.scriptwriter = scriptwriter;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getArea_id() {
        return area_id;
    }

    public void setArea_id(Integer area_id) {
        this.area_id = area_id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRelease_time() {
        return release_time;
    }

    public void setRelease_time(String release_time) {
        this.release_time = release_time;
    }

    public String getMins() {
        return mins;
    }

    public void setMins(String mins) {
        this.mins = mins;
    }

    public String getAlternate_name() {
        return alternate_name;
    }

    public void setAlternate_name(String alternate_name) {
        this.alternate_name = alternate_name;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public String getReview_num() {
        return review_num;
    }

    public void setReview_num(String review_num) {
        this.review_num = review_num;
    }

    public String getEssay_num() {
        return essay_num;
    }

    public void setEssay_num(String essay_num) {
        this.essay_num = essay_num;
    }

    public String getComment_num() {
        return comment_num;
    }

    public void setComment_num(String comment_num) {
        this.comment_num = comment_num;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", scriptwriter='" + scriptwriter + '\'' +
                ", actor='" + actor + '\'' +
                ", genre='" + genre + '\'' +
                ", area='" + area + '\'' +
                ", area_id=" + area_id +
                ", language='" + language + '\'' +
                ", release_time='" + release_time + '\'' +
                ", mins='" + mins + '\'' +
                ", alternate_name='" + alternate_name + '\'' +
                ", imdb='" + imdb + '\'' +
                ", grade=" + grade +
                ", review_num='" + review_num + '\'' +
                ", essay_num='" + essay_num + '\'' +
                ", comment_num='" + comment_num + '\'' +
                '}';
    }
}
