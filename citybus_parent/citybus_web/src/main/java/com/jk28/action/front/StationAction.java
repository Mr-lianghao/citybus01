package com.jk28.action.front;

import java.util.List;

import com.jk28.action.BaseAction;
import com.jk28.domain.Station;
import com.jk28.domain.StationLine;
import com.jk28.service.StationLineService;
import com.jk28.service.StationService;
import com.jk28.util.Page;
import com.opensymphony.xwork2.ModelDriven;

public class StationAction extends BaseAction implements ModelDriven<Station>{

	private Station model = new Station();
	public Station getModel() {
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
	
	//注入StationService
	StationService stationService;
	public void setStationService(StationService stationService) {
		this.stationService = stationService;
	}
	
	//注入StationLine
	StationLineService stationLineService;
	public void setStationLineService(StationLineService stationLineService) {
		this.stationLineService = stationLineService;
	}
	
	/**
	 * 按照站点查找
	 * @return
	 * @throws Exception
	 */
	public String slist() throws Exception {
		//能否直接根据name在stationline查找？--线路id--站点--组合
		List<StationLine> slist = stationLineService.find("from StationLine where station.sname='"+model.getSname()+"'", StationLine.class, null);
		for(StationLine sl:slist){
			System.out.println(sl.getLine().getLname());
		}
		//放入到栈顶
		this.put("slist", slist);
		return "slist";
	}
	
	
	
}
