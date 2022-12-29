package com.alvarez.carlos.inventory.services;

import org.springframework.http.ResponseEntity;

import com.alvarez.carlos.inventory.model.Category;
import com.alvarez.carlos.inventory.response.CategoryResponseRest;

public interface ICategoryService {

	public ResponseEntity<CategoryResponseRest> search();
	
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	
	public ResponseEntity<CategoryResponseRest> save(Category category);
	
	
}
