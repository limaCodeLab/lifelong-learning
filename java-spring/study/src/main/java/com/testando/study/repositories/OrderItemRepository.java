package com.testando.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testando.study.entities.OrderItem;
import com.testando.study.entities.pk.OrderItemPK;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>  {

}
