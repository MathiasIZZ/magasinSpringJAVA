package com.semifir.magasin.dtos.clients;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.semifir.magasin.models.Commande;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FindClientsDTO {
    private Long id;
    private String nom;
    private String prenom;
    private Collection<Commande> commandes;
}
