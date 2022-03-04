package com.semifir.magasin.dtos.commandes;

import com.semifir.magasin.models.Category;
import com.semifir.magasin.models.Client;
import com.semifir.magasin.models.Produit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostCommandeDTO {
    private Client client;
    private Collection<Produit> produits;
}
