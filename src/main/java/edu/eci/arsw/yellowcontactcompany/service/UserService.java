package edu.eci.arsw.yellowcontactcompany.service;

import java.util.List;

import edu.eci.arsw.yellowcontactcompany.model.User;

public interface UserService {

  public List<User> findUserByArea(String area);

  public boolean findUserLogin(String email, String password);

}
