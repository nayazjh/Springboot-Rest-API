package com.nayaz.springboot.service;

import com.nayaz.springboot.dto.UserDto;
import com.nayaz.springboot.entity.User;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

     void deleteUser(Long userId);
}
