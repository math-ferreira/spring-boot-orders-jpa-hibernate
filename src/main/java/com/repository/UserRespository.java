package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.domain.User;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {

}
