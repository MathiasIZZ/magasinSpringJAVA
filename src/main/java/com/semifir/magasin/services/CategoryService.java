package com.semifir.magasin.services;

import com.semifir.magasin.dtos.categories.*;
import com.semifir.magasin.models.Category;
import com.semifir.magasin.repositories.CategoryRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {

    CategoryRepository repository;
    ModelMapper mapper;

    public CategoryService(CategoryRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<FindCategoriesDTO> findAll() {
        List<Category> categories = this.repository.findAll();
        List<FindCategoriesDTO> categoriesDTOS = new ArrayList<>();
        categories.forEach(category -> categoriesDTOS.add(mapper.map(category, FindCategoriesDTO.class)));
        return categoriesDTOS;
    }

    public FindCategoryNameDTO save(PostCategoriesDTO postCategoriesDTO) {
        Category category = mapper.map(postCategoriesDTO, Category.class);
        return mapper.map(this.repository.save(category), FindCategoryNameDTO.class);
    }

    public FindCategoryNameDTO update(PutCategoryDTO putCategoryDTO) {
        Category category = mapper.map(putCategoryDTO, Category.class);
        return mapper.map(this.repository.save(category), FindCategoryNameDTO.class);
    }

    public FindCategoriesDTO findById(Long id) {
        return mapper.map(this.repository.findById(id).get(), FindCategoriesDTO.class);
    }

    public void delete(DeleteCategoriesDTO deleteCategoriesDTO) {
        this.repository.delete(mapper.map(deleteCategoriesDTO, Category.class));
    }
}
