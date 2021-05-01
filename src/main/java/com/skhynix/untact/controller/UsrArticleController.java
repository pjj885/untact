package com.skhynix.untact.controller;

import com.skhynix.untact.dto.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UsrArticleController {

    private List<Article> articles;

    public UsrArticleController() {
        articles = new ArrayList<>();

        articles.add(new Article(1, "2021-05-01", "제목1", "내용1"));
        articles.add(new Article(2, "2021-05-01", "제목2", "내용2"));
    }

    @RequestMapping("usr/article/detail")
    @ResponseBody
    public Article showDetail(int id) {
        return articles.get(id - 1);
    }

    @RequestMapping("usr/article/list")
    @ResponseBody
    public List<Article> showList(){
        return articles;
    }

}
