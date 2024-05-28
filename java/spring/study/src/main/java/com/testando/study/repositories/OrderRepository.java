package com.testando.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testando.study.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
