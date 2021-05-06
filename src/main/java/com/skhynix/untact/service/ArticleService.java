package com.skhynix.untact.service;

import com.skhynix.untact.dao.ArticleDao;
import com.skhynix.untact.dto.Article;
import com.skhynix.untact.dto.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleDao articleDao;

    public Article getArticle(int id) {
        return articleDao.getArticle(id);
    }

    public ResultData addArticle(String title, String body) {
        int id = articleDao.addArticle(title, body);
        return new ResultData("S-1", "성공하였습니다.", "id", id);
    }

    public ResultData deleteArticle(int id) {
        boolean rs = articleDao.deleteArticle(id);

        if (rs == false) {
            return new ResultData("F-1", "해당 게시물은 존재하지 않습니다.", "id", id);
        }
            return new ResultData("S-1", "삭제하였습니다.", "id", id);
    }

    public ResultData modifyArticle(int id, String title, String body) {
        articleDao.modifyArticle(id, title, body);

        return new ResultData("S-1", "게시물을 수정하였습니다.", "id", id);
    }

    public List<Article> getArticles(String searchKeywordType, String searchKeyword) {
        return articleDao.getArticles(searchKeywordType, searchKeyword);
    }
}