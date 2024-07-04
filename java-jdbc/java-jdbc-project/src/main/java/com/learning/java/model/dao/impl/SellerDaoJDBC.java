package com.learning.java.model.dao.impl;

import com.learning.java.db.DbConnectionMap;
import com.learning.java.db.DbException;
import com.learning.java.model.dao.SellerDao;
import com.learning.java.model.entities.Department;
import com.learning.java.model.entities.Seller;
import lombok.Getter;
import lombok.Setter;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class SellerDaoJDBC implements SellerDao {

    private Connection connection;
    private PreparedStatement pstmt;
    private Statement st;
    private ResultSet rs;
    private Department department;

    public SellerDaoJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller findById(Integer id) {
        try {
            pstmt = connection.prepareStatement(
                    "SELECT seller.*,department.Name as DepName "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id "
                            + "WHERE seller.Id = ?");

            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                Department dp = instantiateDepartment(rs);
                return instantiateSeller(rs, dp);
            }
            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DbConnectionMap.closeResultSet(rs);
            DbConnectionMap.closeStatement(pstmt);
        }

    }

    @Override
    public List<Seller> findAll() {
        return List.of();
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        try {
            pstmt = connection.prepareStatement(
                    "SELECT seller.*,department.Name as DepName "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id "
                            + "WHERE DepartmentId = ? "
                            + "ORDER BY Name");

            pstmt.setInt(1, department.getId());
            rs = pstmt.executeQuery();

            List<Seller> list = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>(); // Não permite repetições, aloca os departamentos na memoria

            while (rs.next()){
                this.department = map.get(rs.getInt("DepartmentId"));

                // Verifico se o departamento ja foi instanciado, se o mesmo encontra-se no map
                if (this.department == null){
                    this.department = instantiateDepartment(rs);
                    map.put(rs.getInt("DepartmentId"), this.department);
                }
                list.add(instantiateSeller(rs, this.department));
            }

            return list;

        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DbConnectionMap.closeResultSet(rs);
            DbConnectionMap.closeStatement(pstmt);
        }
    }


    private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException {
        Seller obj = new Seller();
        obj.setId(rs.getInt("Id"));
        obj.setName(rs.getString("Name"));
        obj.setEmail(rs.getString("Email"));
        obj.setBaseSalary(rs.getDouble("BaseSalary"));
        obj.setBirthDate(rs.getDate("BirthDate"));
        obj.setDepartment(dep);
        return obj;
    }

    private Department instantiateDepartment(ResultSet rs) throws SQLException {
        Department dep = new Department();
        dep.setId(rs.getInt("DepartmentId"));
        dep.setName(rs.getString("DepName"));
        return dep;
    }

}
