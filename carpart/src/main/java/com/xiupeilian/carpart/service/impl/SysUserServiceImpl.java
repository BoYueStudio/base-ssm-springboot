package com.xiupeilian.carpart.service.impl;

import com.xiupeilian.carpart.domain.SysUser;
import com.xiupeilian.carpart.mapper.SysUserMapper;
import com.xiupeilian.carpart.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2019/9/3 10:02
 * @Version: 1.0
 **/
@Service

public class SysUserServiceImpl implements SysUserService{
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    /** 如果查询结果集为null，则不缓存**/
    @Cacheable(value="redisCache",unless="#result == null")
    public SysUser findUserById(int id) {
        System.out.println("没有命中缓存");
        return sysUserMapper.selectByPrimaryKey(id);
    }

}
