package cn.itcast.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.Items;

public class ItemsController2 implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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

		request.setAttribute("itemsList", itemsList);
		//设置转发的视图
		request.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(request, response);
		
		//这种方法比较适用于通过修改response，设置响应的数据格式，比如响应json数据
		//response.setCharacterEncoding("UTF-8");
		//response.setContentType("application/json;charset = utf-8");
		//response.getWriter("json串");
		
	}

}
