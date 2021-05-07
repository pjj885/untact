package com.skhynix.untact.dao;

import com.skhynix.untact.dto.Article;
import com.skhynix.untact.dto.ResultData;
import com.skhynix.untact.util.Util;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface ArticleDao {
    public Article getArticle(@Param(value = "id") int id);
    public void addArticle(@Param(value = "title")String title,@Param(value = "body") String body);
    public void deleteArticle(@Param(value = "id")int id);
    public void modifyArticle(@Param(value = "id")int id, @Param(value = "title")String title,@Param(value = "body") String body);
    public List<Article> getArticles(@Param(value = "searchKeywordType")String searchKeywordType,@Param(value = "searchKeyword") String searchKeyword);
}