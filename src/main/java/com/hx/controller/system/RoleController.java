package com.hx.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hx.controller.base.BaseController;
import com.hx.model.common.PageParam;
import com.hx.model.common.Pager;
import com.hx.model.system.Role;
import com.hx.service.system.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController extends BaseController {
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/list")
	public ModelAndView list(@RequestParam(value="page",required=false)String page, @RequestParam(value="keyWord",required=false)String keyWord){
		ModelAndView mav = new ModelAndView();
		if(StringUtils.isEmpty(page)){
			page = "1";
		}
		PageParam pageParam = new PageParam(Integer.parseInt(page), PAGE_ZISE);
		Pager<Role> rolePager = roleService.findByKeyWord(keyWord, pageParam);
		mav.addObject("rolePager",rolePager);
		mav.setViewName("/system/role");
		return mav;
	}
}
