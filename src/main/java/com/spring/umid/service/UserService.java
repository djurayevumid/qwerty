package com.spring.umid.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import com.spring.umid.model.User;

import java.util.List;

@Service
public interface UserService extends UserDetailsService {


    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public User updateUser(User user);

    public User findByUsername(String username);

    public void deleteUser(int id);
}
