package com.testando.study.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.testando.study.entities.User;
import com.testando.study.repositories.UserRepository;
import com.testando.study.services.exceptions.DatabaseException;
import com.testando.study.services.exceptions.ResourceNotFoundException;

@Service // Componente de Servico
public class UserService {

    @Autowired // Injecao de dependencia entre classes, servico e repositorio
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void deleteUser(Long id) {
        try {
            findById(id);
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj) {
        User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setAddress(obj.getAddress());
        entity.setPhone(obj.getPhone());
    }

}
