package com.magang.lazyEgg.dao;

import com.magang.lazyEgg.pojo.SysFile;

public interface SysFileMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysFile record);

    int insertSelective(SysFile record);

    SysFile selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysFile record);

    int updateByPrimaryKey(SysFile record);
}