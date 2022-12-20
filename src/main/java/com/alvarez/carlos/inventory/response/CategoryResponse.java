package com.alvarez.carlos.inventory.response;

import java.util.List;

import com.alvarez.carlos.inventory.model.Category;

import lombok.Data;

@Data
public class CategoryResponse {
	
	private List<Category> category;

}
