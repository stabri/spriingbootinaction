package com.ps.springbootinaction.repositories;

import com.ps.springbootinaction.entities.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, String>{

    Reader findByUsername(String username);
}
