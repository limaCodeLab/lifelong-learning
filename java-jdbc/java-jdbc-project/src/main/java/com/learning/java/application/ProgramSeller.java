package com.learning.java.application;

import com.learning.java.db.DbConnectionMap;
import com.learning.java.model.dao.DaoFactory;
import com.learning.java.model.dao.SellerDao;
import com.learning.java.model.entities.Department;
import com.learning.java.model.entities.Seller;

import java.util.List;

public class ProgramSeller {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao(); // Nao se faz necessario deixar expicito a interface

        System.out.println("=== TEST 1: seller findById =====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment =====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);


        DbConnectionMap.closeConnection();
    }
}
