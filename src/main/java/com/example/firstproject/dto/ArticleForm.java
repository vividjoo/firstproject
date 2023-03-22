package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.Setter;

@Setter
public class ArticleForm {

    String title;
    String content;

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Article toEntity() {
        return new Article(null, title, content);
    }
}
