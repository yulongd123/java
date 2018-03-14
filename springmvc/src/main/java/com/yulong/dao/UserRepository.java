package com.yulong.dao;

import com.yulong.entity.User;

public interface UserRepository {

    User findById(Long id);
}
