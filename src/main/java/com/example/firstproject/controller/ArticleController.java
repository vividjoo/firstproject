package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ArticleController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/article/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/article/create")
    public String create(ArticleForm articleForm) {
        System.out.println(articleForm.toString());

//          1.Dto를  -> Entity로 변환
        Article article = articleForm.toEntity();
        System.out.println(article.toString());
//          2. Repository에게 Entity를 DB안에 저장 하게 함
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }
}
