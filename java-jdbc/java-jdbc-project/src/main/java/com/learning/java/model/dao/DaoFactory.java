package com.learning.java.model.dao;

import com.learning.java.db.DbConnectionMap;
import com.learning.java.model.dao.impl.SellerDaoJDBC;

import java.sql.Connection;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DbConnectionMap.getConnection());
    }

}
