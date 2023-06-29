package ma.suptech.article.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Data
public class Article {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String designation;
    private String codeArticle;
    private int prixUnitaireHT;
    private int prixUnitaireTTC;
    private float tauxTVA;


}

