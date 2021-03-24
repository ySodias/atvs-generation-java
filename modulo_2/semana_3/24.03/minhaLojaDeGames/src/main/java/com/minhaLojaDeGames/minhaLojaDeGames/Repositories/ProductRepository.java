package com.minhaLojaDeGames.minhaLojaDeGames.Repositories;



import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaLojaDeGames.minhaLojaDeGames.Models.ProductModels;

@Repository
public interface ProductRepository extends JpaRepository<ProductModels, Long>{
	
	public List<ProductModels> findByNameContainingIgnoreCase (String name);
}
