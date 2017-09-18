package com.magang.lazyEgg.dao;

import com.magang.lazyEgg.pojo.SysUser;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUser> selectAll();

    SysUser findByAccount(String account);

    SysUser findByEmail(String email);
}