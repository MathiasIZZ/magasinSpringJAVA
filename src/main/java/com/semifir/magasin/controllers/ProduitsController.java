package com.semifir.magasin.controllers;

import com.semifir.magasin.dtos.categories.*;
import com.semifir.magasin.dtos.produits.DeleteProduitDTO;
import com.semifir.magasin.dtos.produits.FindProduitsDTO;
import com.semifir.magasin.dtos.produits.PostProduitDTO;
import com.semifir.magasin.dtos.produits.UpdateProduitDTO;
import com.semifir.magasin.services.CategoryService;
import com.semifir.magasin.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produits")
@CrossOrigin
public class ProduitsController {

    @Autowired
    ProduitService service;

    @GetMapping
    public List<FindProduitsDTO> findAll() {
        return this.service.findAll();
    }
    
    @GetMapping("{id}")
    public FindProduitsDTO findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping
    public FindProduitsDTO save(@RequestBody PostProduitDTO postProduitDTO) {
        return this.service.save(postProduitDTO);
    }

    @PutMapping
    public FindProduitsDTO update(@RequestBody UpdateProduitDTO updateProduitDTO) {
        return this.service.update(updateProduitDTO);
    }

    @DeleteMapping
    public void delete(@RequestBody DeleteProduitDTO deleteProduitDTO) {
        this.service.delete(deleteProduitDTO);
    }

}
