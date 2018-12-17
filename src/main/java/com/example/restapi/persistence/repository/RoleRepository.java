package com.example.restapi.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.restapi.persistence.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role,Long> {

}
