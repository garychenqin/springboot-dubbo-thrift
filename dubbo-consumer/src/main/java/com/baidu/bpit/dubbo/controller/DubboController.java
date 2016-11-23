package com.baidu.bpit.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.baidu.bpit.dubbo.model.User;
import com.baidu.bpit.dubbo.service.UserService;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenshouqin on 2016-11-22 22:35.
 */
@RestController
public class DubboController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Reference
    private UserService.Iface userService;

    @RequestMapping("/user")
    public Object getUserInfo(@RequestParam("name") String username) throws TException {
        long beginTime = System.currentTimeMillis();
        User user = userService.getUserInfoByName(username);
        logger.info("execute time : {}", System.currentTimeMillis() - beginTime);
        return user;
    }
}
