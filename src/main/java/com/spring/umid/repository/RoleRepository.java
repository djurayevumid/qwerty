package com.spring.umid.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.umid.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    public Role findByName(String role);
}
