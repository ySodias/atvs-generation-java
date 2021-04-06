package com.minhaLojaDeGames.minhaLojaDeGames.Controllers;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.minhaLojaDeGames.minhaLojaDeGames.Models.CategoryModel;
import com.minhaLojaDeGames.minhaLojaDeGames.Models.Util.Tipo;
import com.minhaLojaDeGames.minhaLojaDeGames.Services.CategoryService;

@RestController
@RequestMapping("api/v1/lojaGames/category")
@CrossOrigin("*")
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<CategoryModel>>findAllByCategory(){
		return service.findAllCategory();
	}
	@GetMapping("/{id}")
	private ResponseEntity<CategoryModel> findAllCategory(@PathVariable Long id){
		return service.findAllByIdCategory(id);
	}
	@GetMapping("/name/{tipo}")
	public ResponseEntity<List<CategoryModel>>getByTipo(@PathVariable Tipo tipo){
		return service.findByTipo(tipo);
	}
	@PostMapping
	public ResponseEntity<CategoryModel>newCategory(@RequestBody CategoryModel category){
		return service.postNewCategory(category);
	}
	@PutMapping
	public ResponseEntity<CategoryModel>editCategory(@RequestBody CategoryModel category){
		return service.putNewCategory(category);
	}
	@DeleteMapping("/{id}")
	public void deleteExistentCategory(@PathVariable Long id) {
		service.deleteCategory(id);
	}
}