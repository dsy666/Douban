package com.example.Douban.pojo;

public class Book {
    private Integer id;
    private String name;
    private String author;
    private String publisher;
    private String price;
    private String subhead;
    private String press;
    private String publish_date;
    private String translator;
    private String pagination;
    private String binding;
    private String isbn;
    private Double grade;
    private String intro;
    private Integer essay_count;
    private Integer review_count;
    private String icon_url;
    private String content;

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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSubhead() {
        return subhead;
    }

    public void setSubhead(String subhead) {
        this.subhead = subhead;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getPagination() {
        return pagination;
    }

    public void setPagination(String pagination) {
        this.pagination = pagination;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getEssay_count() {
        return essay_count;
    }

    public void setEssay_count(Integer essay_count) {
        this.essay_count = essay_count;
    }

    public Integer getReview_count() {
        return review_count;
    }

    public void setReview_count(Integer review_count) {
        this.review_count = review_count;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price='" + price + '\'' +
                ", subhead='" + subhead + '\'' +
                ", press='" + press + '\'' +
                ", publish_date='" + publish_date + '\'' +
                ", translator='" + translator + '\'' +
                ", pagination='" + pagination + '\'' +
                ", binding='" + binding + '\'' +
                ", isbn='" + isbn + '\'' +
                ", grade=" + grade +
                ", intro='" + intro + '\'' +
                ", essay_count=" + essay_count +
                ", review_count=" + review_count +
                ", icon_url='" + icon_url + '\'' +
                ", content='" + content + '\'' +

                '}';
    }
}
