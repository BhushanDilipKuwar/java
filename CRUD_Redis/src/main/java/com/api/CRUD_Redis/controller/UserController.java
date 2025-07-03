package com.api.CRUD_Redis.controller;

import com.api.CRUD_Redis.dao.UserDao;
import com.api.CRUD_Redis.models.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserDao userDao;

    //create user
    @PostMapping
    public Users createUser(@RequestBody Users user){
      user.setUserId(UUID.randomUUID().toString());
      return userDao.save(user);
    }

    //get single user
    @GetMapping("/{userId}")
    public Users getSingleUser(@PathVariable("userId") String userId){
      return userDao.get(userId);
    }

    //find All
    @GetMapping
    public List<Users> getAll(){
        Map<Object, Object> all = userDao.findAll();
        Collection<Object> values = all.values();
        List<Users> collect = values.stream().map(value -> (Users) value).collect(Collectors.toList());
        return collect;
    }

    //Update user
    @PutMapping("/{userId}")
    public  Users updateUser(@RequestBody Users user,@PathVariable String userId){
        return userDao.updateUser(user, userId);
    }

    //delete user
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable String userId){
       userDao.deleteUser(userId);
    }
}
