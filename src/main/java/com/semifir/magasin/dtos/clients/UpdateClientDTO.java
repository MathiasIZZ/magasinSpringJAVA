package com.semifir.magasin.dtos.clients;

import com.semifir.magasin.models.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateClientDTO {
    private Long id;
    private String nom;
    private String prenom;
}
