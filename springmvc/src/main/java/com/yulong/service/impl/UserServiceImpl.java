package com.yulong.service.impl;

import com.yulong.dao.UserRepository;
import com.yulong.entity.User;
import com.yulong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Cacheable(value = "findById",key = "#id")
    @Override
    public User findById(Long id) {
        return userRepository.findById(id);
    }
}
