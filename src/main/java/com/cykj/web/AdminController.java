package com.cykj.web;

import com.cykj.bean.AdminBean;
import com.cykj.service.imp.AdminServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @author: Sapphier Star
 * @date: 2021/7/12 22:25
 * @desc:
 */
@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminServiceImp adminService;

    @RequestMapping("hello")
    public String hello(){
        return "hello";
    }


    @ResponseBody
    @RequestMapping("login")
    public String login(AdminBean adminBean){
        System.out.println(adminBean);
        adminBean = adminService.login(adminBean);
        System.out.println(adminBean);
        if ( null != adminBean){
            return "登录成功";
        }
        return "登录失败";
    }

}
