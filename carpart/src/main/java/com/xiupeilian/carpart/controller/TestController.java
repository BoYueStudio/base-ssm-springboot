package com.xiupeilian.carpart.controller;

import com.xiupeilian.carpart.domain.SysUser;
import com.xiupeilian.carpart.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Set;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2019/9/3 10:24
 * @Version: 1.0
 **/
@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping("/detail")
    public String findUser(int id, ModelMap map,HttpSession session){
        Set<Object> set=redisTemplate.keys("*session*");
        map.addAttribute("user", sysUserService.findUserById(id));
        return "test";
    }
}
