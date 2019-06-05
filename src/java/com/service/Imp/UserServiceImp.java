package com.service.Imp;

import com.dao.UserDao;
import com.pojo.Dog;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserDao userDao;
    @Override
    public List<Dog> getUserOrByName(String name) {
        return userDao.getUser(name);
    }
}
