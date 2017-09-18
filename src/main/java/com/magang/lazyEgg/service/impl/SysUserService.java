package com.magang.lazyEgg.service.impl;

import com.github.pagehelper.PageHelper;
import com.magang.core.DataGridPage;
import com.magang.core.freemark.FreemarkEngine;
import com.magang.core.utils.Uuid;
import com.magang.lazyEgg.dao.SysFileMapper;
import com.magang.lazyEgg.dao.SysUserMapper;
import com.magang.lazyEgg.pojo.SysFile;
import com.magang.lazyEgg.pojo.SysUser;
import com.magang.lazyEgg.service.ISysUserService;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
public class SysUserService implements ISysUserService {

    private static final String articleTemplateName = "userInfo.ftl";

    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysFileMapper sysFileMapper;
    @Autowired
    private FreemarkEngine freemarkEngine;

    @Override
    public int deleteByPrimaryKey(String id) {
        return sysUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SysUser record) {
        return sysUserMapper.insert(record);
    }

    @Override
    public int insertSelective(SysUser record) {
        record.setId(Uuid.getId());
        return sysUserMapper.insertSelective(record);
    }

    @Override
    public SysUser selectByPrimaryKey(String id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return sysUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return sysUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public DataGridPage<SysUser> selectAll (Integer page,Integer rows){
        PageHelper.startPage(page,rows);
        List<SysUser> list = sysUserMapper.selectAll();
        return DataGridPage.create(list);
    }

    @Override
    public SysUser findByAccount(String account){
        return sysUserMapper.findByAccount(account);
    }

    public SysUser findByEmail(String email){
        return sysUserMapper.findByEmail(email);
    }

    @Override
    public SysUser parseHtml(String userId){
        SysUser sysUser = sysUserMapper.selectByPrimaryKey(userId);
        if(null == sysUser){
            return sysUser;
        }
        Map map = new HashMap<String,Object>();
        map.put("user",sysUser);

        SysFile sysFile = sysFileMapper.selectByPrimaryKey(sysUser.getImgId());
        if(null != sysFile){
            map.put("imgPath","/lazyegg/"+sysFile.getFilepath());
        }

        try {
            String html = freemarkEngine.mergeTemplateIntoString(articleTemplateName,map);
            sysUser.setTemplateHtml(html);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        return sysUser;
    }
}