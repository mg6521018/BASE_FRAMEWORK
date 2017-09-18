package com.magang.lazyEgg.service;

import com.magang.lazyEgg.pojo.SysFile;

public interface ISysFileService {
    int deleteByPrimaryKey(String id);

    int insert(SysFile record);

    int insertSelective(SysFile record);

    SysFile selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysFile record);

    int updateByPrimaryKey(SysFile record);
}