package com.service;

import com.pojo.Dog;

import java.util.List;

public interface UserService {
    List<Dog> getUserOrByName(String name);
}
