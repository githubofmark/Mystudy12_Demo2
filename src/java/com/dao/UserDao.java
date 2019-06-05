package com.dao;

import com.pojo.Dog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<Dog> getUser(@Param("name") String name);
}
