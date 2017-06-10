package com.jk28.action.behind;

import com.jk28.action.BaseAction;
import com.jk28.domain.Admin;
import com.jk28.service.AdminService;
import com.jk28.service.impl.AdminServiceImpl;
import com.jk28.util.Page;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class AdminAction extends BaseAction implements ModelDriven<Admin>{

	private Admin model = new Admin();
	public Admin getModel() {
		return model ;
	}
	//分页查询
	private Page page  = new Page();
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	
	//注入AdminService
	AdminService AdminService;
	public void setAdminService(AdminService AdminService) {
		this.AdminService = AdminService;
	}
	
	
	/**
	 * 登陆
	 * @return
	 * @throws Exception
	 */
	public String login() throws Exception {
		
		return "success";
	}
	
	
}
