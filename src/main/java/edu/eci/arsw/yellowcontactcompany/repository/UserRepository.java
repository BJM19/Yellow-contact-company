package edu.eci.arsw.yellowcontactcompany.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.eci.arsw.yellowcontactcompany.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
