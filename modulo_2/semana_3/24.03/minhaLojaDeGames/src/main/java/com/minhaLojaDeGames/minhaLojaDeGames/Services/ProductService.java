package com.minhaLojaDeGames.minhaLojaDeGames.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.minhaLojaDeGames.minhaLojaDeGames.Models.ProductModels;
import com.minhaLojaDeGames.minhaLojaDeGames.Repositories.ProductRepository;


@Service
public class ProductService {

	@Autowired
	private ProductRepository repositoryProduct;
	
	public ResponseEntity<List<ProductModels>>findAllProduct(){
		return ResponseEntity.ok(repositoryProduct.findAll());
	}
	public ResponseEntity<ProductModels>findAllByProduct(Long id){
		return repositoryProduct.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	public ResponseEntity<List<ProductModels>>findByDescricaoProduct(String name){
		return ResponseEntity.ok(repositoryProduct.findByNameContainingIgnoreCase(name));
	}
	public ResponseEntity<ProductModels>postNewProduct(ProductModels product){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryProduct.save(product));
	}
	
	public ResponseEntity<ProductModels>putNewProduct(ProductModels product){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryProduct.save(product));
	}
	
	public void deleteProduct(Long id) {
		repositoryProduct.deleteById(id);
	}
}
