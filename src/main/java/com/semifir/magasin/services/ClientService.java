package com.semifir.magasin.services;

import com.semifir.magasin.dtos.clients.DeleteClientDTO;
import com.semifir.magasin.dtos.clients.FindClientsDTO;
import com.semifir.magasin.dtos.clients.PostClientDTO;
import com.semifir.magasin.dtos.clients.UpdateClientDTO;
import com.semifir.magasin.dtos.produits.DeleteProduitDTO;
import com.semifir.magasin.dtos.produits.FindProduitsDTO;
import com.semifir.magasin.dtos.produits.PostProduitDTO;
import com.semifir.magasin.dtos.produits.UpdateProduitDTO;
import com.semifir.magasin.models.Client;
import com.semifir.magasin.models.Produit;
import com.semifir.magasin.repositories.ClientRepository;
import com.semifir.magasin.repositories.ProduitRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class ClientService {

    ClientRepository repository;
    ModelMapper mapper;

    public ClientService(ClientRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<FindClientsDTO> findAll() {
        List<Client> clients = this.repository.findAll();
        List<FindClientsDTO> clientsDTOS = new ArrayList<>();
        clients.forEach(client -> clientsDTOS.add(mapper.map(client, FindClientsDTO.class)));
        return clientsDTOS;
    }

    public FindClientsDTO save(PostClientDTO postClientDTO) {
        Client client = mapper.map(postClientDTO, Client.class);
        return mapper.map(this.repository.save(client), FindClientsDTO.class);
    }

    public FindClientsDTO update(UpdateClientDTO updateClientDTO) {
        Client client = mapper.map(updateClientDTO, Client.class);
        return mapper.map(this.repository.save(client), FindClientsDTO.class);
    }

    public FindClientsDTO findById(Long id) {
        return mapper.map(this.repository.findById(id).get(), FindClientsDTO.class);
    }

    public void delete(DeleteClientDTO deleteClientDTO) {
        this.repository.delete(mapper.map(deleteClientDTO, Client.class));
    }
}
