package com.spring.umid.userInit;

import com.spring.umid.service.UserService;
import org.springframework.stereotype.Component;
import com.spring.umid.model.Role;
import com.spring.umid.model.User;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class UserInit {

    private final UserService userService;

    public UserInit(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    private void userInit(){
        Role adminRole = new Role("ADMIN");
        Role userRole = new Role("USER");

        Set<Role> admins = new HashSet<>();
        Set<Role> users = new HashSet<>();

        admins.add(adminRole);
        users.add(userRole);

        User admin = new User("Admin", "Admin", "admin@mail.ru", 54, "admin", admins);
        User user = new User("User", "User", "user@mail.ru", 54,"user", users);

        userService.saveUser(admin);
        userService.saveUser(user);
    }

}
