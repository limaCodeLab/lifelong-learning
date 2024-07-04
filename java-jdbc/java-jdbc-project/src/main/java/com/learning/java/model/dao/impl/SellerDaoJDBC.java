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
    private ResultSet rs;
    private Department department;

    public SellerDaoJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Seller obj) {
        try {
            pstmt = connection.prepareStatement(
                    "INSERT INTO seller "
                            + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                            + "VALUES "
                            + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, obj.getName());
            pstmt.setString(2, obj.getEmail());
            pstmt.setDate(3, new Date(obj.getBirthDate().getTime()));
            pstmt.setDouble(4, obj.getBaseSalary());
            pstmt.setInt(5, obj.getDepartment().getId());

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setId(id); // populando o id ao objeto
                }
                DbConnectionMap.closeResultSet(rs); // fechando aqui pois nao vai estar no escopo do finally
            } else {
                throw new DbException("Unexpected error! No rows affected!");
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DbConnectionMap.closeStatement(pstmt);
        }

    }

    @Override
    public void update(Seller obj) {
        try {
            pstmt = connection.prepareStatement(
                    "UPDATE seller "
                            + "SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? "
                            + "WHERE Id = ?");
            pstmt.setString(1, obj.getName());
            pstmt.setString(2, obj.getEmail());
            pstmt.setDate(3, new Date(obj.getBirthDate().getTime()));
            pstmt.setDouble(4, obj.getBaseSalary());
            pstmt.setInt(5, obj.getDepartment().getId());
            pstmt.setInt(6, obj.getId());

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new DbException("Unexpected error! No rows affected!");
            }
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DbConnectionMap.closeStatement(pstmt);
        }

    }

    @Override
    public void deleteById(Integer id) {
        try {
            pstmt = connection.prepareStatement("DELETE FROM seller WHERE Id = ?");

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DbConnectionMap.closeStatement(pstmt);
        }
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
        try {
            pstmt = connection.prepareStatement(
                    "SELECT seller.*,department.Name as DepName "
                            + "FROM seller INNER JOIN department "
                            + "ON seller.DepartmentId = department.Id "
                            + "ORDER BY Name");

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
