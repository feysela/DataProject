package com.datademo.dataproject.repositories;

import com.datademo.dataproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
