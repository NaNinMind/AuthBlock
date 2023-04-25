//package com.example.demo.controller;
//
//import com.example.demo.model.UserModel;
//import com.example.demo.model.DBRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@CrossOrigin(origins = "http://localhost:8080")
//@RestController
//@RequestMapping("/api")
//public class UsersController{
//
//    @Autowired
//    DBRepository dbRepository;
//
//    @GetMapping("/users")
//    public ResponseEntity<List<UserModel>> getAllUserModels(@RequestParam(required = false) String title) {
//        try {
//            List<UserModel> users = new ArrayList<UserModel>();
//            if (title == null)
//                dbRepository.findAll().forEach(users::add);
//            else
//                dbRepository.findByUsernameContaining(title).forEach(users::add);
//
//            if (users.isEmpty()) {
//                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//            }
//
//            return new ResponseEntity<>(users, HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
////    @GetMapping("/users/{id}")
////    public ResponseEntity<UserModel> getUserModelById(@PathVariable("id") long id) {
////        UserModel user = dbRepository.findById(id);
////        if (user != null) {
////            return new ResponseEntity<>(user, HttpStatus.OK);
////        } else {
////            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
////        }
////    }
//
//    @PostMapping("/users")
//    public ResponseEntity<String> createUserModel(@RequestBody UserModel user) {
////        try {
//            dbRepository.save(new UserModel(user.getUsername(), user.getPassword()));
//            return new ResponseEntity<>("UserModel was created successfully.", HttpStatus.CREATED);
////        } catch (Exception e) {
////            System.out.println("!!!here!!!");
////            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
////        }
//    }
//
////    @PutMapping("/users/{id}")
////    public ResponseEntity<String> updateUserModel(@PathVariable("id") long id, @RequestBody UserModel user) {
////        UserModel _user = dbRepository.findById(id);
////
////        if (_user != null) {
////            _user.setId(id);
////            _user.setUsername(user.getUsername());
////            _user.setPassword(user.getPassword());
////
////            dbRepository.update(_user);
////            return new ResponseEntity<>("UserModel was updated successfully.", HttpStatus.OK);
////        } else {
////            return new ResponseEntity<>("Cannot find UserModel with id=" + id, HttpStatus.NOT_FOUND);
////        }
////    }
//
//    @DeleteMapping("/users/{id}")
//    public ResponseEntity<String> deleteUserModel(@PathVariable("id") long id) {
//        try {
//            int result = dbRepository.deleteById(id);
//            if (result == 0) {
//                return new ResponseEntity<>("Cannot find UserModel with id=" + id, HttpStatus.OK);
//            }
//            return new ResponseEntity<>("UserModel was deleted successfully.", HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>("Cannot delete user.", HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @DeleteMapping("/users")
//    public ResponseEntity<String> deleteAllUserModels() {
//        try {
//            int numRows = dbRepository.deleteAll();
//            return new ResponseEntity<>("Deleted " + numRows + " UserModel(s) successfully.", HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>("Cannot delete users.", HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//
//    }
//}
