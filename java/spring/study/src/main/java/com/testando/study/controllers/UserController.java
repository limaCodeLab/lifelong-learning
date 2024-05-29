package com.testando.study.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.testando.study.entities.User;
import com.testando.study.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



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

    /**
     * Metodo HTTP POST Cria novo usuario
     * @param obj
     * @return
     */
    @PostMapping(value = "/insert")
    public ResponseEntity<User> insert(@RequestBody User obj) {
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
        .buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }
    
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<User> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
