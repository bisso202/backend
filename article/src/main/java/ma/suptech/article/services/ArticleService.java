package ma.suptech.article.services;

import ma.suptech.article.model.Article;

import java.util.List;

public interface ArticleService {
     List<Article> listArticle();
     Article findOneArticle(Long id);
    Article saveArticle(Article article);
    Article updateArticle(Article article);

    void deleteArticle(Long id);

}
