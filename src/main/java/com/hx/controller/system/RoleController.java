package com.hx.controller.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hx.controller.base.BaseController;
import com.hx.model.system.Role;
import com.hx.service.system.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController extends BaseController {
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/list")
	public ModelAndView list(@RequestParam(defaultValue = "")String keyWord){
		ModelAndView mav = new ModelAndView();
		List<Role> list = roleService.findByKeyWord(keyWord);
		mav.addObject("roleList",list);
		mav.setViewName("/system/role");
		return mav;
	}
}
