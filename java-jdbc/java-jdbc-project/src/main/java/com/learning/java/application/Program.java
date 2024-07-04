package com.learning.java.application;

import com.learning.java.db.DbConnectionMap;
import com.learning.java.model.dao.DaoFactory;
import com.learning.java.model.dao.SellerDao;
import com.learning.java.model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao(); // Nao se faz necessario deixar expicito a interface
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        DbConnectionMap.closeConnection();
    }
}
