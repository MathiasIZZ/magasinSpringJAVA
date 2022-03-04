package com.semifir.magasin.repositories;

import com.semifir.magasin.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
