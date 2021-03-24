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
import org.springframework.web.bind.annotation.RestController;

import com.minhaLojaDeGames.minhaLojaDeGames.Models.ProductModels;
import com.minhaLojaDeGames.minhaLojaDeGames.Services.ProductService;

@RestController
@RequestMapping("api/v1/lojaGames/product")
@CrossOrigin("*")
public class ProductController {
	@Autowired
	private ProductService service;
	
		
	@GetMapping("/{id}")
	private ResponseEntity<ProductModels> getByIdProduct(@PathVariable Long id){
		return service.findAllByProduct(id);
	}
	@GetMapping
	public ResponseEntity<List<ProductModels>>getByAllProduct(){
		return service.findAllProduct();
	}
	@GetMapping("/name/{name}")
	public ResponseEntity<List<ProductModels>>getByNameProduct(@PathVariable String name){
		return service.findByDescricaoProduct(name);
	}
	@PostMapping
	public ResponseEntity<ProductModels>newProduct(@RequestBody ProductModels product){
		return service.postNewProduct(product);
	}
	@PutMapping
	public ResponseEntity<ProductModels>editProduct(@RequestBody ProductModels product){
		return service.putNewProduct(product);
	}
	@DeleteMapping("/{id}")
	public void deleteExistentProduct(@PathVariable Long id) {
		service.deleteProduct(id);
	}
}
