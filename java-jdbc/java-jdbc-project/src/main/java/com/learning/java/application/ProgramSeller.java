package com.learning.java.application;

import com.learning.java.db.DbConnectionMap;
import com.learning.java.model.dao.DaoFactory;
import com.learning.java.model.dao.SellerDao;
import com.learning.java.model.entities.Department;
import com.learning.java.model.entities.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProgramSeller {

    static List<Seller> list = new ArrayList<>();

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao(); // Nao se faz necessario deixar expicito a interface


        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 3: seller findAll =====");
        list = sellerDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 4: seller insert =====");
        Seller newSeller = new Seller(null, "Greg", "XKjP3@example.com", new Date(), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());


        DbConnectionMap.closeConnection();
    }
}
