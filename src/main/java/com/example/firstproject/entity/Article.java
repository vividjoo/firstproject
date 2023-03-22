package com.example.firstproject.entity;

import jakarta.persistence.*;

@Entity     // DB가 해당 객츨 인식 가능
public class Article {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    String title;
    @Column
    String content;

    public Article() {
    }

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
