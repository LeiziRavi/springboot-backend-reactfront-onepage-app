package com.app.ravi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ravi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
