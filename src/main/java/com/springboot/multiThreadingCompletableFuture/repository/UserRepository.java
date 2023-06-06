package com.springboot.multiThreadingCompletableFuture.repository;

import com.springboot.multiThreadingCompletableFuture.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
