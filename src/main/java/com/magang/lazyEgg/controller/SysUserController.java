package com.magang.lazyEgg.controller;

import javax.servlet.http.HttpServletRequest;

import com.magang.core.DataGridPage;
import com.magang.core.web.ResultVo;
import com.magang.lazyEgg.pojo.SysUser;
import com.magang.lazyEgg.service.ISysUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class SysUserController {

	@Autowired
	private ISysUserService sysUserService;

	@RequestMapping("/showUser")
	@ResponseBody
	public SysUser showUser(HttpServletRequest request, @RequestParam(required=true) String userId) {
		SysUser sysUser = this.sysUserService.selectByPrimaryKey(userId);

		return sysUser;
	}

	@RequestMapping("/showList")
	@ResponseBody
	public DataGridPage<SysUser> showList(HttpServletRequest request,
										  @RequestParam(required=false,defaultValue="1") Integer page,
										  @RequestParam(required=false,defaultValue="10") Integer rows) {
		DataGridPage<SysUser> users= this.sysUserService.selectAll(page,rows);
		return users;
	}

	@RequestMapping("/reg")
	@ResponseBody
	public ResultVo reg(HttpServletRequest request, SysUser sysUser) {
		ResultVo vo = new ResultVo();
		SysUser user = sysUserService.findByAccount(sysUser.getAccount());
		if(null != user){
			vo.setSuccess(false);
			vo.setMsg("用户名已存在");
			return vo;
		}

		user = sysUserService.findByEmail(sysUser.getEmail());
		if(null != user){
			vo.setSuccess(false);
			vo.setMsg("邮箱已注册");
			return vo;
		}
		try{
			sysUserService.insertSelective(sysUser);
			vo.setSuccess(true);
		}
		catch (Exception e){
			e.printStackTrace();
			vo.setSuccess(false);
			vo.setMsg(e.getMessage());
		}

		return vo;
	}

	@RequestMapping("/userInfo")
	@ResponseBody
	public SysUser userInfo(HttpServletRequest request, @RequestParam(required=false) String userId) {

		if(StringUtils.isBlank(userId)){
			userId = "1123";
		}

		SysUser sysUser = this.sysUserService.parseHtml(userId);

		return sysUser;
	}
}