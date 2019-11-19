package com.example.Douban.pojo;

public class Music {
    private String id;

    private String name;

    private String player;

    private String genre;

    private String albumType;

    private String medium;

    private String releaseDate;

    private String publisher;

    private Integer recordNum;

    private String barCode;

    private String coverUrl;

    private Double grade;

    private Integer essayCount;

    private Integer reviewCount;

    private String intro;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player == null ? null : player.trim();
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre == null ? null : genre.trim();
    }

    public String getAlbumType() {
        return albumType;
    }

    public void setAlbumType(String albumType) {
        this.albumType = albumType == null ? null : albumType.trim();
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium == null ? null : medium.trim();
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate == null ? null : releaseDate.trim();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher == null ? null : publisher.trim();
    }

    public Integer getRecordNum() {
        return recordNum;
    }

    public void setRecordNum(Integer recordNum) {
        this.recordNum = recordNum;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl == null ? null : coverUrl.trim();
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Integer getEssayCount() {
        return essayCount;
    }

    public void setEssayCount(Integer essayCount) {
        this.essayCount = essayCount;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    @Override
    public String toString() {
        return "Music{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", player='" + player + '\'' +
                ", genre='" + genre + '\'' +
                ", albumType='" + albumType + '\'' +
                ", medium='" + medium + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", publisher='" + publisher + '\'' +
                ", recordNum=" + recordNum +
                ", barCode='" + barCode + '\'' +
                ", coverUrl='" + coverUrl + '\'' +
                ", grade=" + grade +
                ", essayCount=" + essayCount +
                ", reviewCount=" + reviewCount +
                ", intro='" + intro + '\'' +
                '}';
    }
}