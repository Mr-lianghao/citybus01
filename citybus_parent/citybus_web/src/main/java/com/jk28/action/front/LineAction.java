package com.jk28.action.front;


import java.util.List;

import com.jk28.action.BaseAction;
import com.jk28.domain.Line;
import com.jk28.domain.StationLine;
import com.jk28.service.LineService;
import com.jk28.service.StationLineService;
import com.jk28.util.Page;
import com.opensymphony.xwork2.ModelDriven;

public class LineAction extends BaseAction implements ModelDriven<Line>{

	private Line model = new Line();
	public Line getModel() {
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
	//注入LineService
	LineService LineService;
	public void setLineService(LineService LineService) {
		this.LineService = LineService;
	}
	
	//注入stationService
	StationLineService stationLineService;
	public void setStationLineService(StationLineService stationLineService) {
		this.stationLineService = stationLineService;
	}
	
	/**
	 * 分页
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception {
		page.setPageSize(5);
		LineService.findPage("from Line", page, Line.class, null);
		//放入值栈
		
		this.push(page);
		page.setUrl("lineAction_list");
		return "list";
	}
	
	/**
	 * 查看详情
	 * @return
	 * @throws Exception
	 */
	public String view() throws Exception {
		Line line = LineService.get(Line.class, model.getLid());
		String hql="from StationLine where line.lid='"+model.getLid()+"'";
		List<StationLine> find = stationLineService.find(hql, StationLine.class, null);
		StringBuilder sb = new StringBuilder();
		if(find!=null&&find.size()>0){
			for(StationLine sl:find){
				sb.append(sl.getStation().getSname()).append("→");
			}
			sb.delete(sb.length()-1, sb.length());
		}
		line.setLineString(sb.toString());
		
		this.push(line);
		return "view";
	}
	
	
}
