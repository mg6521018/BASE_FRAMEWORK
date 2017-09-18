package com.magang.lazyEgg.service.impl;

import com.magang.lazyEgg.dao.SysFileMapper;
import com.magang.lazyEgg.pojo.SysFile;
import com.magang.lazyEgg.service.ISysFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by magang on 2017/9/13.
 */
@Service("sysFileService")
public class SysFileService implements ISysFileService{

    @Autowired
    private SysFileMapper sysFileMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysFileMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysFile record) {
        return sysFileMapper.insert(record);
    }

    @Override
    public int insertSelective(SysFile record) {
        return sysFileMapper.insertSelective(record);
    }

    @Override
    public SysFile selectByPrimaryKey(String id) {
        return sysFileMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysFile record) {
        return sysFileMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysFile record) {
        return sysFileMapper.updateByPrimaryKey(record);
    }
}
