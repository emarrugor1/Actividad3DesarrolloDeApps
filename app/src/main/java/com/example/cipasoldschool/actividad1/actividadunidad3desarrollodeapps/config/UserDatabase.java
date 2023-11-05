package com.example.cipasoldschool.actividad1.actividadunidad3desarrollodeapps.config;

import com.example.cipasoldschool.actividad1.actividadunidad3desarrollodeapps.model.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    List<UserEntity> users = new ArrayList<>();
    private UserDatabase(){
        initUserDatabase();
    }
    private List<UserEntity> initUserDatabase(){
        users.add(new UserEntity(1,"juan01","123456","juan perez"));
        users.add(new UserEntity(2,"maria01","123456","Maria Lopez"));
        return users;
    }
    public UserEntity login(String userEmail,String password){
        UserEntity userFound = null;
        for(UserEntity user:users){
            if(user.getEmail().equals(userEmail)  && user.getPassword().equals(password)){
                userFound = user;
                break;
            }
        }
        return userFound;
    }
}
