package ma.suptech.article.services;

import ma.suptech.article.model.Article;
import ma.suptech.article.repositories.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public List<Article> listArticle() {
        return this.articleRepository.findAll();
    }

    @Override
    public Article findOneArticle(Long id) {
        return this.articleRepository.findById(id).orElse(null);
    }

    @Override
    public Article saveArticle(Article article) {
        return this.articleRepository.save(article);
    }

    @Override
    public Article updateArticle(Article article) {
        return this.articleRepository.save(article);
    }

    @Override
    public void deleteArticle(Long id) {
        this.articleRepository.deleteById(id);
    }

}
