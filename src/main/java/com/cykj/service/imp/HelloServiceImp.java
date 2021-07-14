package com.cykj.service.imp;

import com.cykj.bean.UserBean;
import com.cykj.mapper.UserMapper;
import com.cykj.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @author: Sapphier Star
 * @date: 2021/7/12 16:20
 * @desc:
 */
@Service
public class HelloServiceImp implements HelloService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserBean login(UserBean userBean) {
        return userMapper.login(userBean);
    }
}
