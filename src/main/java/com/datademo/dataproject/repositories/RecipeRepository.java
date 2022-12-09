package com.datademo.dataproject.repositories;

import com.datademo.dataproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
