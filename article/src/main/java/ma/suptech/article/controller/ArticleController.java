package ma.suptech.article.controller;

import ma.suptech.article.model.Article;
import ma.suptech.article.services.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }
    @GetMapping("articles")
    public List<Article> listAllArticle(){
        return this.articleService.listArticle();
    }

    @GetMapping("articles/{id}")
    public Article getOneArticle(@PathVariable Long id){
        return this.articleService.findOneArticle(id);
    }

    @PutMapping("article")
    public Article updateArticle(@RequestBody Article article){
        return this.articleService.updateArticle(article);
    }
    @PostMapping("article")
    public Article saveArticle(@RequestBody Article article){
        return this.articleService.saveArticle(article);
    }

    @DeleteMapping("article/{id}")
    public void removeArticle(@PathVariable Long id){
        this.articleService.deleteArticle(id);
    }
}
