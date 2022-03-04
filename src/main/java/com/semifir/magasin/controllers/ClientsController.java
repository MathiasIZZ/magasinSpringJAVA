package com.semifir.magasin.controllers;

import com.semifir.magasin.dtos.categories.*;
import com.semifir.magasin.dtos.clients.DeleteClientDTO;
import com.semifir.magasin.dtos.clients.FindClientsDTO;
import com.semifir.magasin.dtos.clients.PostClientDTO;
import com.semifir.magasin.dtos.clients.UpdateClientDTO;
import com.semifir.magasin.services.CategoryService;
import com.semifir.magasin.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
@CrossOrigin
public class ClientsController {

    @Autowired
    ClientService service;

    @GetMapping
    public List<FindClientsDTO> findAll() {
        return this.service.findAll();
    }
    
    @GetMapping("{id}")
    public FindClientsDTO findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping
    public FindClientsDTO save(@RequestBody PostClientDTO postClientDTO) {
        return this.service.save(postClientDTO);
    }

    @PutMapping
    public FindClientsDTO update(@RequestBody UpdateClientDTO updateClientDTO) {
        return this.service.update(updateClientDTO);
    }

    @DeleteMapping
    public void delete(@RequestBody DeleteClientDTO deleteClientDTO) {
        this.service.delete(deleteClientDTO);
    }

}
