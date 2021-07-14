package com.cykj.service.imp;

import com.cykj.bean.AdminBean;
import com.cykj.mapper.AdminMapper;
import com.cykj.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version 1.0
 * @author: Sapphier Star
 * @date: 2021/7/12 23:08
 * @desc:
 */
@Service
public class AdminServiceImp implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public AdminBean login(AdminBean adminBean) {
        return adminMapper.login(adminBean);
    }
}
