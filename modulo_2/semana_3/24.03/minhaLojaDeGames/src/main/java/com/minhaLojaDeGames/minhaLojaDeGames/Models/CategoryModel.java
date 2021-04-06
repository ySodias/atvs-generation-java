package com.minhaLojaDeGames.minhaLojaDeGames.Models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.minhaLojaDeGames.minhaLojaDeGames.Models.Util.Tipo;
import com.sun.istack.NotNull;

@Entity
@Table(name = "Category")
public class CategoryModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	
	@NotNull
	@Size(min=12, max=255)
	private String description;
	
	@Column(columnDefinition = "varchar(255) default 'livre'")
	private String ageRange;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("category")
	private List<ProductModels> product;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Tipo getName() {
		return tipo;
	}

	public void setName(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}

	public List<ProductModels> getProduct() {
		return product;
	}

	public void setProduct(List<ProductModels> product) {
		this.product = product;
	}
}
