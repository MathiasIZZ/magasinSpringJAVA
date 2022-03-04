package com.semifir.magasin.services;

import com.semifir.magasin.dtos.commandes.DeleteCommandeDTO;
import com.semifir.magasin.dtos.commandes.FindCommandesDTO;
import com.semifir.magasin.dtos.commandes.PostCommandeDTO;
import com.semifir.magasin.dtos.commandes.UpdateCommandeDTO;
import com.semifir.magasin.models.Commande;
import com.semifir.magasin.repositories.CommandeRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class CommandeService {

    CommandeRepository repository;
    ModelMapper mapper;

    public CommandeService(CommandeRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<FindCommandesDTO> findAll() {
        List<Commande> commandes = this.repository.findAll();
        List<FindCommandesDTO> findCommandesDTOS = new ArrayList<>();
        commandes.forEach(commande -> findCommandesDTOS.add(mapper.map(commande, FindCommandesDTO.class)));
        return findCommandesDTOS;
    }

    public FindCommandesDTO save(PostCommandeDTO postCommandeDTO) {
        Commande commande = mapper.map(postCommandeDTO, Commande.class);
        return mapper.map(this.repository.save(commande), FindCommandesDTO.class);
    }

    public FindCommandesDTO update(UpdateCommandeDTO updateCommandeDTO) {
        Commande commande = mapper.map(updateCommandeDTO, Commande.class);
        return mapper.map(this.repository.save(commande), FindCommandesDTO.class);
    }

    public FindCommandesDTO findById(Long id) {
        return mapper.map(this.repository.findById(id).get(), FindCommandesDTO.class);
    }

    public void delete(DeleteCommandeDTO deleteCommandeDTO) {
        this.repository.delete(mapper.map(deleteCommandeDTO, Commande.class));
    }
}
