package com.testando.study.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testando.study.entities.Category;
import com.testando.study.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping // Metodo HTTP GET
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    /**
     * Metodo HTTP GET Encontra usuario pelo id, parametro acrescentado na URL
     * 
     * @param id
     * @return
     */
    @GetMapping(params = "id") // localhost:8080/Categorys?id=1
    public ResponseEntity<Category> findByIdParam(@RequestParam Long id) {
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    /**
     * Metodo HTTP GET Encontra usuario pelo id, parametro modificado na URL atraves
     * do /{id}
     * 
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}") // localhost:8080/Categorys/1
    public ResponseEntity<Category> findByIdValue(@PathVariable Long id) {
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
