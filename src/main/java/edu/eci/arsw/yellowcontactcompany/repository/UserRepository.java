package edu.eci.arsw.yellowcontactcompany.repository;
import org.springframework.data.jpa.repository.JpaRepository;


import edu.eci.arsw.yellowcontactcompany.model.User;



public interface UserRepository extends JpaRepository<User, Integer> {

}
