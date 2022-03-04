package com.semifir.magasin.controllers;

import com.semifir.magasin.dtos.categories.*;
import com.semifir.magasin.dtos.commandes.DeleteCommandeDTO;
import com.semifir.magasin.dtos.commandes.FindCommandesDTO;
import com.semifir.magasin.dtos.commandes.PostCommandeDTO;
import com.semifir.magasin.dtos.commandes.UpdateCommandeDTO;
import com.semifir.magasin.services.CategoryService;
import com.semifir.magasin.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("commandes")
@CrossOrigin
public class CommandesController {

    @Autowired
    CommandeService service;

    @GetMapping
    public List<FindCommandesDTO> findAll() {
        return this.service.findAll();
    }
    
    @GetMapping("{id}")
    public FindCommandesDTO findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping
    public FindCommandesDTO save(@RequestBody PostCommandeDTO postCommandeDTO) {
        return this.service.save(postCommandeDTO);
    }

    @PutMapping
    public FindCommandesDTO update(@RequestBody UpdateCommandeDTO updateCommandeDTO) {
        return this.service.update(updateCommandeDTO);
    }

    @DeleteMapping
    public void delete(@RequestBody DeleteCommandeDTO deleteCommandeDTO) {
        this.service.delete(deleteCommandeDTO);
    }

}
