package com.jaypee.demo.mysqlaccess;

import org.springframework.data.repository.CrudRepository;
import com.jaypee.demo.mysqlaccess.User;

public interface UserRepository extends CrudRepository<User, Integer>{
    
}
