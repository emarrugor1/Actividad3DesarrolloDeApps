package com.example.cipasoldschool.actividad1.actividadunidad3desarrollodeapps.util;

import com.example.cipasoldschool.actividad1.actividadunidad3desarrollodeapps.dto.User;
import com.example.cipasoldschool.actividad1.actividadunidad3desarrollodeapps.model.UserEntity;

public class UserMapper {
    private UserMapper(){}
    public static User userEntityToUser(UserEntity userEntity){
        User user = new User();
        user.setEmail(userEntity.getEmail());
        user.setName(userEntity.getName());
        user.setPassword(userEntity.getPassword());
        return user;
    }
    public static UserEntity userToUserEntity(User user){
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(user.getEmail());
        userEntity.setName(user.getName());
        userEntity.setPassword(user.getPassword());
        return userEntity;
    }
}
