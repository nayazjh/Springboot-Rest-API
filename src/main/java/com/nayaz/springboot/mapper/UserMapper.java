package com.nayaz.springboot.mapper;

import com.nayaz.springboot.dto.UserDto;
import com.nayaz.springboot.entity.User;

public class UserMapper {

    //Convert User JPA Entity to UserDto
    public static UserDto mapUserToDto(User user) {
        UserDto userDto = new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );

        return userDto;
    }

    //Convert UserDto into User Jpa Entity
    public static User mapToUser(UserDto userDto) {
        User user = new User(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );

        return user;
    }
}
