package com.api.CRUD_Redis.dao;

import com.api.CRUD_Redis.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserDao {


    @Autowired
     private RedisTemplate<String, Object> redisTemplate;

     private  static final String key = "USER";

     //save Users
     public Users save(Users user){
         redisTemplate.opsForHash().put(key, user.getUserId(), user);
         return user;
     }

     //get Users
    public Users get(String userId){
       return (Users)redisTemplate.opsForHash().get(key, userId);
    }

    //find all Users
       public Map<Object, Object>findAll(){
         return redisTemplate.opsForHash().entries(key);
       }

       //update user
    public Users updateUser(Users user, String userId){

         Users existUser = (Users) redisTemplate.opsForHash().get(key, userId);
           if( existUser!=null){
               user.setUserId(userId);
               redisTemplate.opsForHash().put(key, userId, user);
               return  user;
           }

         return null;
    }


    //Delete user
    public void deleteUser(String userId){
         redisTemplate.opsForHash().delete(key, userId);

    }
}
