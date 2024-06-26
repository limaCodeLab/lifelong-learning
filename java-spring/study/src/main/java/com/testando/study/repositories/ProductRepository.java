package com.testando.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testando.study.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
