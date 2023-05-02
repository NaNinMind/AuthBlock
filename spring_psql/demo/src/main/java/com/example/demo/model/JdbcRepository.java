//package com.example.demo.model;
//
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//@RequiredArgsConstructor
//public class JdbcRepository implements UserRepository {
//
//    //@Autowired
//    private final JdbcTemplate jdbcTemplate;
//
//
//    @Override
//    public int save(UserModel user) {
//        return jdbcTemplate.update("INSERT INTO users(username, password) VALUES(?,?)",
//                new Object[] { user.getUsername(), user.getPassword() });
//    }
//
////    @Override
////    public int update(UserModel user) {
////        return jdbcTemplate.update("UPDATE users SET username=?, password=? WHERE id=?",
////                new Object[] { user.getUsername(), user.getPassword(), user.getId() });
////    }
//
////    @Override
////    public UserModel findById(Long id) {
////        try {
////            UserModel user = jdbcTemplate.queryForObject("SELECT * FROM users WHERE id=?",
////                    BeanPropertyRowMapper.newInstance(UserModel.class), id);
////            return user;
////        } catch (IncorrectResultSizeDataAccessException e) {
////            return null;
////        }
////    }
//
//    @Override
//    public int deleteById(Long id) {
//        return jdbcTemplate.update("DELETE FROM users WHERE id=?", id);
//    }
//
//    @Override
//    public List<UserModel> findAll() {
//        return jdbcTemplate.query("SELECT * from users", BeanPropertyRowMapper.newInstance(UserModel.class));
//    }
//
//    @Override
//    public List<UserModel> findByUsernameContaining(String login) {
//        String q = "SELECT * from users WHERE username ILIKE '%" + login + "%'";
//
//        return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(UserModel.class));
//    }
//
//    @Override
//    public int deleteAll() {
//        return jdbcTemplate.update("DELETE from users");
//    }
//
//    @Override
//    public Optional<UserModel> findByUsername(String username) {
//        String q = "SELECT * from users WHERE username = \'" + username + "\'";
//
//        var res = jdbcTemplate.query(q,BeanPropertyRowMapper.newInstance(UserModel.class));
//        if (res.isEmpty()){
//            return null;
//        }
//        return Optional.ofNullable(res.get(0));
//        //return jdbcTemplate.query(q, BeanPropertyRowMapper.newInstance(UserModel.class));
//    }
//}
