package com.semifir.magasin.services;

import com.semifir.magasin.dtos.categories.*;
import com.semifir.magasin.dtos.produits.DeleteProduitDTO;
import com.semifir.magasin.dtos.produits.FindProduitsDTO;
import com.semifir.magasin.dtos.produits.PostProduitDTO;
import com.semifir.magasin.dtos.produits.UpdateProduitDTO;
import com.semifir.magasin.models.Category;
import com.semifir.magasin.models.Produit;
import com.semifir.magasin.repositories.CategoryRepository;
import com.semifir.magasin.repositories.ProduitRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class ProduitService {

    ProduitRepository repository;
    ModelMapper mapper;

    public ProduitService(ProduitRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<FindProduitsDTO> findAll() {
        List<Produit> produits = this.repository.findAll();
        List<FindProduitsDTO> produitsDTOS = new ArrayList<>();
        produits.forEach(produit -> produitsDTOS.add(mapper.map(produit, FindProduitsDTO.class)));
        return produitsDTOS;
    }

    public FindProduitsDTO save(PostProduitDTO postProduitDTO) {
        Produit produit = mapper.map(postProduitDTO, Produit.class);
        return mapper.map(this.repository.save(produit), FindProduitsDTO.class);
    }

    public FindProduitsDTO update(UpdateProduitDTO updateProduitDTO) {
        Produit produit = mapper.map(updateProduitDTO, Produit.class);
        return mapper.map(this.repository.save(produit), FindProduitsDTO.class);
    }

    public FindProduitsDTO findById(Long id) {
        return mapper.map(this.repository.findById(id).get(), FindProduitsDTO.class);
    }

    public void delete(DeleteProduitDTO deleteProduitDTO) {
        this.repository.delete(mapper.map(deleteProduitDTO, Produit.class));
    }
}
