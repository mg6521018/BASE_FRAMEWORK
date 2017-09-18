package com.magang.lazyEgg.controller;

import com.magang.core.web.ResultVo;
import com.magang.lazyEgg.pojo.SysUser;
import com.magang.lazyEgg.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

	@Autowired
	private ISysUserService sysUserService;

	@RequestMapping("/login")
	@ResponseBody
	public ResultVo showUser(HttpServletRequest request,
							 @RequestParam(required=true) String account,
							 @RequestParam(required=true) String password) {
		ResultVo result = new ResultVo(true);
		SysUser sysUser = sysUserService.findByAccount(account);
		//用户不存在 返回登录页
		if(null == sysUser){
			result.setSuccess(false);
			result.setMsg("用户名或密码错误！");
			return result;
		}

		//密码错误 返回登录页
		if(!sysUser.getPassword().equals(password)){
			result.setSuccess(false);
			result.setMsg("用户名或密码错误！");
			return result;
		}

		//密码错误 返回登录页
		if(sysUser.getStatus() != 1){
			result.setSuccess(false);
			result.setMsg(sysUser.getStatus()==0?"未激活":"已禁用");
			return result;
		}

		//操作RADIS存储票据

		return result;
	}

}