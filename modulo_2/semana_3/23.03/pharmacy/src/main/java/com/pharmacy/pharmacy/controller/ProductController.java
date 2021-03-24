package com.pharmacy.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

import com.pharmacy.pharmacy.model.Product;
import com.pharmacy.pharmacy.repository.ProductRepository;


@RestController
@RequestMapping("/api/v1/product")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private ProductRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<Product>>findAllProduct(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product>findAllByProduct(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Product>>findByDescricaoTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity<Product>post(@RequestBody Product product){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(product));
	}
	
	@PutMapping
	public ResponseEntity<Product>put(@RequestBody Product product){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(product));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
