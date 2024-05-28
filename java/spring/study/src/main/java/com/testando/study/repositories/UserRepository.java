package com.testando.study.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testando.study.entities.User;

@Repository // Componente
public interface UserRepository extends JpaRepository<User, Long> {

}
