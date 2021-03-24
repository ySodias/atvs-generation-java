package com.minhaLojaDeGames.minhaLojaDeGames.Repositories;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaLojaDeGames.minhaLojaDeGames.Models.CategoryModel;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long>{
	
	public List<CategoryModel> findByDescriptionContainingIgnoreCase (String description);
}
