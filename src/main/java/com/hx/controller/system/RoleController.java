package com.hx.controller.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hx.controller.base.BaseController;
import com.hx.model.common.PageParam;
import com.hx.model.system.Role;
import com.hx.service.system.RoleService;
import com.hx.util.PageUtils;

@Controller
@RequestMapping("/role")
public class RoleController extends BaseController {
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/list")
	public ModelAndView list(@RequestParam(value="page",required=false)String page, @RequestParam(value="keyWord",required=false)String keyWord){
		if(StringUtils.isEmpty(page)){
			page = "1";
		}
		PageParam pageParam = new PageParam(Integer.parseInt(page), PAGE_ZISE);
		List<Role> roleList = roleService.findByKeyWord(keyWord, pageParam);
		int totalCount = roleService.count(keyWord);
		String pageCode=PageUtils.getPagation(request.getContextPath()+"/role/list", totalCount, Integer.parseInt(page), PAGE_ZISE);
		ModelAndView mav = new ModelAndView();
		mav.addObject("roleList",roleList);
		mav.addObject("keyWord", keyWord);
		mav.addObject("pageCode", pageCode);
		mav.setViewName("/system/role");
		return mav;
	}
}
