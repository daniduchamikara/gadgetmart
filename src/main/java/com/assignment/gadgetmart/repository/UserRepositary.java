package com.assignment.gadgetmart.repository;

import com.assignment.gadgetmart.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositary extends JpaRepository<User,Integer> {

    User findByEmailAndPassword(String email,String password);
}
