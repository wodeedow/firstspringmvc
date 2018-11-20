package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.Items;


//娉ㄨВ寮�彂Handler
//@RequestMapping瀹炵幇�?筿ueryItem鏂规硶鍜孶RL杩涜鏄犲皠锛屼竴涓柟娉曞搴斾竴涓槧灏�?//涓�埇灏哢RL鍜屾柟娉曞啓鎴愪竴鏍�?@RequestMapping("/queryItems")
public class ItemsController3 {
	public ModelAndView queryItems() throws Exception{
List<Items> itemsList = new ArrayList<Items>();
		
		//闁告碍鍞╥st濞戞搩鍘奸敐鐐哄礂閸涘瓨楗柟顑跨劍閺嗙喖骞戦敓锟�
		Items items_1 = new Items();
		items_1.setName("aa");
		items_1.setPrice(6000f);
		items_1.setDetail("ThinkPad T430  ");
		
		Items items_2 = new Items();
		items_2.setName("bb");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6");
		
		itemsList.add(items_1);
		itemsList.add(items_2);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList", itemsList);
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		return modelAndView;
	}
	
	//鍟嗗搧娣诲姞鍑芥�?
}
