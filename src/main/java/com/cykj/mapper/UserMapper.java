package com.cykj.mapper;

import com.cykj.bean.UserBean;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @author: Sapphier Star
 * @date: 2021/7/11 17:14
 * @desc:
 */
@Repository
public interface UserMapper {
    UserBean login(UserBean userBean);
}
