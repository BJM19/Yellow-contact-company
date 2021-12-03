package edu.eci.arsw.yellowcontactcompany.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.eci.arsw.yellowcontactcompany.dao.UserDao;
import edu.eci.arsw.yellowcontactcompany.model.User;

@Repository
public class UserDaoImpl implements UserDao {

  @Autowired
    private EntityManager entityManager;

  @Override
  public List<User> findAll() {
    return null;
  }

  @Override
  public List<User> findByArea(String area) {

      Session currentSession = entityManager.unwrap(Session.class);

      Query<User> usersQuery = currentSession.createQuery("from User where area=:areaUser", User.class);
      
      usersQuery.setParameter("areaUser", area);

      List<User> users = usersQuery.getResultList();
    
      return users;
  }

    @Override
    public User findByEmail(String emailUser) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<User> usersQuery = currentSession.createQuery("from User where email=:emailUser", User.class);

        usersQuery.setParameter("emailUser", emailUser);

        User user = usersQuery.getSingleResult();
        return user;
    }

}
