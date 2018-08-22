package com.ps.springbootinaction.repositories;

import com.ps.springbootinaction.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.nio.file.attribute.UserPrincipalLookupService;

@Repository
public interface ReaderRepository extends JpaRepository<User, Long>{

    User findbyName(String username);
}
