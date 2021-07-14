package com.cykj.service;

import com.cykj.bean.AdminBean;
import org.apache.ibatis.annotations.Param;

/**
 * @version 1.0
 * @author: Sapphier Star
 * @date: 2021/7/12 23:08
 * @desc:
 */
public interface AdminService {
    AdminBean login(AdminBean adminBean);
}
