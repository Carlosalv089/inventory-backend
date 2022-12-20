package com.alvarez.carlos.inventory.services;

import org.springframework.http.ResponseEntity;

import com.alvarez.carlos.inventory.response.CategoryResponseRest;

public interface ICategoryService {

	public ResponseEntity<CategoryResponseRest> search();
	
	
}
