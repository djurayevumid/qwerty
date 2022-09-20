package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleService {

    public List<Role> getAllRoles();

    public Role getRoleByName(String name);

    public void addRole(Role role);

    public void updateRole(Role role);

    public void removeRoleById(int id);
}
