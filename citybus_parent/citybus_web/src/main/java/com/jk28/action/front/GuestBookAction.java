package com.jk28.action.front;

import com.jk28.action.BaseAction;
import com.jk28.domain.GuestBook;
import com.jk28.service.GuestBookService;
import com.jk28.service.impl.GuestBookServiceImpl;
import com.jk28.util.Page;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class GuestBookAction extends BaseAction implements ModelDriven<GuestBook>{

	private GuestBook model = new GuestBook();
	public GuestBook getModel() {
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
	
	//注入GuestBookService
	GuestBookService guestBookService;
	public void setGuestBookService(GuestBookService guestBookService) {
		this.guestBookService = guestBookService;
	}
	
	
	/**
	 * 分页
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception {
		//查找所有
		guestBookService.findPage("from GuestBook", page, GuestBook.class, null);
		//放入值栈
		this.push(page);
		return "list";
	}
	
	
}
