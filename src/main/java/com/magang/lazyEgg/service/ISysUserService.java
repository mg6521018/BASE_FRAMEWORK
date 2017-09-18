package com.magang.lazyEgg.service;

import com.magang.core.DataGridPage;
import com.magang.lazyEgg.pojo.SysUser;

import java.util.List;

public interface ISysUserService {
	int deleteByPrimaryKey(String id);

	int insert(SysUser record);

	int insertSelective(SysUser record);

	SysUser selectByPrimaryKey(String id);

	int updateByPrimaryKeySelective(SysUser record);

	int updateByPrimaryKey(SysUser record);

	DataGridPage<SysUser>  selectAll(Integer page,Integer rows);

	SysUser findByAccount(String account);

    SysUser findByEmail(String email);

	SysUser parseHtml(String userId);
}