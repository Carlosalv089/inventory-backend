package com.alvarez.carlos.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.alvarez.carlos.inventory.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{

}
