package com.spring.umid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.umid.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Integer>{
    public User findByUsername(String username);

}
