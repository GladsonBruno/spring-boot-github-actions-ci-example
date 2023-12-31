package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.security.ERole;
import com.example.demo.entity.security.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}