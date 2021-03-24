package com.minhaLojaDeGames.minhaLojaDeGames.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.minhaLojaDeGames.minhaLojaDeGames.Models.CategoryModel;

import com.minhaLojaDeGames.minhaLojaDeGames.Repositories.CategoryRepository;



@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repositoryCategory;
	
	
	/*
	 * Retorna do Banco uma lista de nomes da Categoria
	 * @param name tipo String
	 * @param description tipo String
	 * @return Lista com nomes quando os parametros estiverem devidamente descritos, caso contrario lista vazia
	 * @since 1.0
	 * @author Yuri Dias
	 */
	
	public ResponseEntity<List<CategoryModel>>findAllCategory(){
		return ResponseEntity.ok(repositoryCategory.findAll());
	}
	
	public ResponseEntity<CategoryModel>findAllByIdCategory(Long id){
		return repositoryCategory.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	public ResponseEntity<List<CategoryModel>>findByDescriptionCategory(String description){
		return ResponseEntity.ok(repositoryCategory.findByDescriptionContainingIgnoreCase(description));
	}
	
	public ResponseEntity<CategoryModel>postNewCategory(CategoryModel category){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryCategory.save(category));
	}
	
	public ResponseEntity<CategoryModel>putNewCategory(CategoryModel category){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryCategory.save(category));
	}

	public void deleteCategory(Long id) {
		repositoryCategory.deleteById(id);
	}
	
}
