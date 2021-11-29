package edu.eci.arsw.yellowcontactcompany.dao;

import java.util.List;

import edu.eci.arsw.yellowcontactcompany.model.User;

public interface UserDao {

    public List<User> findAll();

    public List<User> findByArea(String area);  
}
