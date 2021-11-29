package edu.eci.arsw.yellowcontactcompany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.yellowcontactcompany.dao.UserDao;
import edu.eci.arsw.yellowcontactcompany.model.User;
import edu.eci.arsw.yellowcontactcompany.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findUserByArea(String area) {
        List<User> users = userDao.findByArea(area);
        return users;
    }

	/*@Autowired
    private UserRepository urepository;*/
	
	
	

}
