package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository /*extends JpaRepository<UserModel, Integer>*/ {
    Optional<UserModel> findByUsername(String username);

    public int save(UserModel user);
    public int deleteById(Long id);
    public List<UserModel> findAll();
    public List<UserModel> findByUsernameContaining(String login);
    public int deleteAll();
}
