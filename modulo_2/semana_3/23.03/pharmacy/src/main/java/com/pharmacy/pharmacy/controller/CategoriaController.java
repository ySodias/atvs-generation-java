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

import com.pharmacy.pharmacy.model.Category;
import com.pharmacy.pharmacy.repository.CategoryRepository;

@RestController
@RequestMapping("/api/v1/category")
@CrossOrigin("*")
public class CategoriaController {
	
	@Autowired
	private CategoryRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<Category>>findAllCategory(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category>findAllByCategory(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Category>>findByDescricaoCategory(@PathVariable String descricao){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping
	public ResponseEntity<Category>post(@RequestBody Category category){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(category));
	}
	
	@PutMapping
	public ResponseEntity<Category>put(@RequestBody Category category){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(category));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
