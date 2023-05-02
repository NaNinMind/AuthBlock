package com.example.demo.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {


    /* and (t.expired = false or t.revoked = false) */
    @Query("""
             select t from Token t inner join user u on t.user.id = u.id
             where u.id = :uid
           """)
    List<Token> findAllValidTokensByUser(Integer uid);

    Optional<Token> findByToken(String token);
}
