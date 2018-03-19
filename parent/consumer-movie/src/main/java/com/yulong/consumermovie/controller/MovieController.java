package com.yulong.consumermovie.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yulong.consumermovie.entity.User;
import com.yulong.consumermovie.rpc.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc:
 * @author: yulong
 * @date: 2018/3/19
 */
@RestController
@RequestMapping("movie")
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @HystrixCommand(fallbackMethod = "")
    @GetMapping("{id}")
    public User findById(@PathVariable("id") Long id){
        return userFeignClient.findById(id);
    }

}
