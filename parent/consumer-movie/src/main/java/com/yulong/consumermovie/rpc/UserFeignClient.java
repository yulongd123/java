package com.yulong.consumermovie.rpc;

import com.yulong.consumermovie.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @desc:
 * @author: yulong
 * @date: 2018/3/19
 */
@FeignClient(name = "provider-user")
@RequestMapping("user")
public interface UserFeignClient {

    @GetMapping("{id}")
    User findById(@PathVariable("id") Long id);
}
