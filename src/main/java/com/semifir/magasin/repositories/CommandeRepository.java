package com.semifir.magasin.repositories;

import com.semifir.magasin.models.Client;
import com.semifir.magasin.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
