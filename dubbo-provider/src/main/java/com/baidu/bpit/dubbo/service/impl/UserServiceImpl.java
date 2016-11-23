package com.baidu.bpit.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baidu.bpit.dubbo.model.User;
import com.baidu.bpit.dubbo.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenshouqin on 2016-11-23 13:11.
 */
@Service
@Component
public class UserServiceImpl implements UserService.Iface {


    @Override
    public User getUserInfoByName(String username) {
        User user = new User();
        user.setName(username);
        user.setAge(20);
        user.setCity("Qingdao");
        List<User> list = new ArrayList<User>();
        User sub = new User();
        sub.setName("Tom");
        sub.setAge(15);
        sub.setCity("Beijing");
        sub.setSub(new ArrayList<User>());
        list.add(sub);
        user.setSub(list);
        return user;
    }
}
