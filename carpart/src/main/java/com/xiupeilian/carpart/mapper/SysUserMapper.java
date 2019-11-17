package com.xiupeilian.carpart.mapper;

import com.xiupeilian.carpart.domain.SysUser;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2019/9/2 13:44
 * @Version: 1.0
 **/
public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

}
