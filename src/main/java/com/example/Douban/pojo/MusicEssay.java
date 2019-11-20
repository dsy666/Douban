package com.example.Douban.pojo;

/**
 * 用于存储一条乐评的信息
 */
public class MusicEssay {
    private Integer id;
    private String songId;
    private String userIcon;
    private String userName;
    private String contents;
    private String discussDate;
    private Integer usefulCount;
    private Integer unusefulCount;
    private Integer replayCount;
    private String contentsTitle;

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

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setDiscussDate(String discussDate) {
        this.discussDate = discussDate;
    }

    public void setUsefulCount(Integer usefulCount) {
        this.usefulCount = usefulCount;
    }

    public void setUnusefulCount(Integer unusefulCount) {
        this.unusefulCount = unusefulCount;
    }

    public void setReplayCount(Integer replayCount) {
        this.replayCount = replayCount;
    }

    public void setContentsTitle(String contentsTitle) {
        this.contentsTitle = contentsTitle;
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

    public String getContents() {
        return contents;
    }

    public String getDiscussDate() {
        return discussDate;
    }

    public Integer getUsefulCount() {
        return usefulCount;
    }

    public Integer getUnusefulCount() {
        return unusefulCount;
    }

    public Integer getReplayCount() {
        return replayCount;
    }

    public String getContentsTitle() {
        return contentsTitle;
    }

    @Override
    public String toString() {
        return "MusicEssay{" +
                "id=" + id +
                ", songId='" + songId + '\'' +
                ", userIcon='" + userIcon + '\'' +
                ", userName='" + userName + '\'' +
                ", contents='" + contents + '\'' +
                ", discussDate='" + discussDate + '\'' +
                ", usefulCount=" + usefulCount +
                ", unusefulCount=" + unusefulCount +
                ", replayCount=" + replayCount +
                ", contentsTitle='" + contentsTitle + '\'' +
                '}';
    }
}
