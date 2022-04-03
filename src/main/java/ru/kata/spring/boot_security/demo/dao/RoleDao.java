package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleDao {
    List<Role> getAll();
    List<Role> getByName(List<String> name);
    void saveRole(Role role);
}
