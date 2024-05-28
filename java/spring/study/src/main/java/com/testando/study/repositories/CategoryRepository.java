package com.testando.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testando.study.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
