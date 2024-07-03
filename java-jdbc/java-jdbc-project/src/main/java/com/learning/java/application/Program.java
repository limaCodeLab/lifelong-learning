package com.learning.java.application;

import com.learning.java.model.dao.DaoFactory;
import com.learning.java.model.dao.SellerDao;

public class Program {

    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao(); // Nao se faz necessario deixar expicito a interface
    }
}
