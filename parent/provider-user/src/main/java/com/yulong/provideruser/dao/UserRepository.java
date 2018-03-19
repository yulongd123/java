package com.yulong.provideruser.dao;

import com.yulong.provideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @desc:
 * @author: yulong
 * @date: 2018/3/19
 */
public interface UserRepository extends JpaRepository<User,Long>{
}
