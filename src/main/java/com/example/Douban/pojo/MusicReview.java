package com.example.Douban.pojo;

/**
 * 用于存储一条音乐短评的信息
 */
public class MusicReview {
    private Integer id;
    private String songId;
    private String userIcon;
    private String userName;
    private String content;
    private String discussDate;
    private Integer usefulCount;

    @Override
    public String toString() {
        return "MusicReview{" +
                "id=" + id +
                ", songId='" + songId + '\'' +
                ", userIcon='" + userIcon + '\'' +
                ", userName='" + userName + '\'' +
                ", content='" + content + '\'' +
                ", discussDate='" + discussDate + '\'' +
                ", usefulCount=" + usefulCount +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDiscussDate(String discussDate) {
        this.discussDate = discussDate;
    }

    public void setUsefulCount(Integer usefulCount) {
        this.usefulCount = usefulCount;
    }

    public Integer getId() {
        return id;
    }

    public String getSongId() {
        return songId;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public String getUserName() {
        return userName;
    }

    public String getContent() {
        return content;
    }

    public String getDiscussDate() {
        return discussDate;
    }

    public Integer getUsefulCount() {
        return usefulCount;
    }
}
