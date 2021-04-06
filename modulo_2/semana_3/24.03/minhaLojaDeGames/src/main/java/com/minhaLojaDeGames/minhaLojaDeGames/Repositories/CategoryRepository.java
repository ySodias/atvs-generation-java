package com.minhaLojaDeGames.minhaLojaDeGames.Repositories;






import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhaLojaDeGames.minhaLojaDeGames.Models.CategoryModel;
import com.minhaLojaDeGames.minhaLojaDeGames.Models.Util.Tipo;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Long>{
	
	public List<CategoryModel> findAllByTipo (Tipo tipo);

}
