package com.semifir.magasin.dtos.produits;

import com.semifir.magasin.models.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindProduitsDTO {
    private Long id;
    private String nom;
    private Double prix;
    private Category category;
}
