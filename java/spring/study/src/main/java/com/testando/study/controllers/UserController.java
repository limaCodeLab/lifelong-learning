package com.testando.study.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testando.study.entities.User;
import com.testando.study.services.UserService;


@RestController // Classe controladora componente de recurso
@RequestMapping(value = "/users") // localhost:8080/users isso define o caminho da API
public class UserController {

    @Autowired // automatically injected dependencies by Spring 
    private UserService service; // Injecao de dependencia entre classes, servico e repositorio

    @GetMapping // Metodo HTTP GET
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    /**
     * Metodo HTTP GET Encontra usuario pelo id, parametro acrescentado na URL
     * @param id
     * @return
     */
    @GetMapping(params = "id") // localhost:8080/users?id=1
    public ResponseEntity<User> findByIdParam(@RequestParam Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    /**
     * Metodo HTTP GET Encontra usuario pelo id, parametro modificado na URL atraves do /{id}
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}") // localhost:8080/users/1
    public ResponseEntity<User> findByIdValue(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    
}
