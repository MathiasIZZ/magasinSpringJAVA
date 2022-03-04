package com.semifir.magasin.dtos.produits;

import com.semifir.magasin.models.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProduitDTO {
    private Long id;
    private String nom;
    private Double prix;
    private Category category;
}
