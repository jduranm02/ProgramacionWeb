package com.back.prowebback.user.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.back.prowebback.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
