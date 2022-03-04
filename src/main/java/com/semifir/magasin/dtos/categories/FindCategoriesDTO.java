package com.semifir.magasin.dtos.categories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindCategoriesDTO {
    private Long id;
    private String nom;
}
