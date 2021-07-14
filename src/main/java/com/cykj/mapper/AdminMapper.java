package com.cykj.mapper;

import com.cykj.bean.AdminBean;
import org.springframework.stereotype.Repository;

/**
 * @version 1.0
 * @author: Sapphier Star
 * @date: 2021/7/12 22:50
 * @desc:
 */
@Repository
public interface AdminMapper {
    AdminBean login(AdminBean adminBean);
}
