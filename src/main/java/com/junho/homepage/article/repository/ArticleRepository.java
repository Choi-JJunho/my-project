package com.junho.homepage.article.repository;

import com.junho.homepage.article.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
