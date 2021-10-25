package edu.eci.arsw.yellowcontactcompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.eci.arsw.yellowcontactcompany.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserRepository urepository;
	
	
	

}
