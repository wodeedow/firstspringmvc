package cn.itcast.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.itcast.ssm.po.Items;

public class ItemsController1 implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		List<Items> itemsList = new ArrayList<Items>();
			
		//閸氭唨ist娑擃厼锝為崗鍛存饯閹焦鏆熼幑锟�
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

		//鏉╂柨娲朚odelAndView
		ModelAndView modelAndView =  new ModelAndView();
		//閻╃缍�娴滃窎equest閻ㄥ墕etAttribut閿涘苯婀猨sp妞ょ敻娼版稉顓拷鏉╁檮temsList閸欐牗鏆熼幑锟�
		modelAndView.addObject("itemsList", itemsList);
		
		//閹稿洤鐣剧憴鍡楁禈
		modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");

		return modelAndView;
	}
	}
