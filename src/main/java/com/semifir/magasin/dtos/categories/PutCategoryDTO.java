package com.semifir.magasin.dtos.categories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PutCategoryDTO {
    private Long id;
    private String nom;
}
