package com.semifir.magasin.controllers;

import com.semifir.magasin.dtos.categories.*;
import com.semifir.magasin.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
@CrossOrigin
public class CategoriesController {

    @Autowired
    CategoryService service;

    @GetMapping
    public List<FindCategoriesDTO> findAll() {
        return this.service.findAll();
    }
    
    @GetMapping("{id}")
    public FindCategoriesDTO findById(@PathVariable Long id) {
        return this.service.findById(id);
    }

    @PostMapping
    public FindCategoryNameDTO save(@RequestBody PostCategoriesDTO postCategoriesDTO) {
        return this.service.save(postCategoriesDTO);
    }

    @PutMapping
    public FindCategoryNameDTO update(@RequestBody PutCategoryDTO putCategoryDTO) {
        return this.service.update(putCategoryDTO);
    }

    @DeleteMapping
    public void delete(@RequestBody DeleteCategoriesDTO deleteCategoriesDTO) {
        this.service.delete(deleteCategoriesDTO);
    }

}
