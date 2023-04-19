package lk.ijse.orm.hostelManagementSystem.dao.custom.impl;

import lk.ijse.metropolitan.dao.custom.QueryDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class QueryDAOImpl implements QueryDAO {
    @Override
    public ArrayList getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean add(Object entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(Object entity) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public Object search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }
}
