package com.xiupeilian.carpart.controller;

import com.xiupeilian.carpart.domain.SysUser;
import com.xiupeilian.carpart.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2019/9/3 10:02
 * @Version: 1.0
 **/
//restController注解相当于controller注解和responseBody注解的组合
@RestController
@RequestMapping("/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @GetMapping("/detail")
    public SysUser findUser(int id){
        return sysUserService.findUserById(id);
    }
}
