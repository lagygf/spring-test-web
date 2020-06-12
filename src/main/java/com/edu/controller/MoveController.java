package com.edu.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.edu.bean.moveBooking;
import com.edu.service.MoveBookingService;
import com.edu.service.impl.MoveBookingServiceImpl;


@Controller
public class MoveController {
	@Autowired
	private MoveBookingService moveBookingService;
	
	private String[] states = new  String[]{"未处理","已处理","已结束"};

	@RequestMapping(value="/list",method = {RequestMethod.GET,RequestMethod.POST})
	  public String login(Model model){
		List<moveBooking> moveBookingList = moveBookingService.getAll();
		model.addAttribute("moveBookingList", moveBookingList);
		 return "list";
	  }
	
	@RequestMapping("/XqUI")
	public String XqUI(moveBooking moveBooking,Model model) {
		moveBooking moveBookingList = moveBookingService.selectmoveById(moveBooking);
		
    	model.addAttribute("moveBookingList", moveBookingList);
		return "XqUI" ;
	}
	
	@RequestMapping("/XgUI")
	public String XgUI(moveBooking moveBooking,Model model) {
		moveBooking moveBookingList = moveBookingService.selectmoveById(moveBooking);
    	model.addAttribute("moveBookingList", moveBookingList);
		return "XgUI" ;
	}
	//修改
    @RequestMapping(value = "/update",method = RequestMethod.POST)
	public String update(moveBooking moveBooking ,Model model) {
    	System.out.println(moveBooking);
    	moveBookingService.updatemove(moveBooking);
    	
		return "redirect:/list" ;
	}
    
    @RequestMapping("/addUI")
	public String addUI(HttpServletRequest request,Model model) {
		return "addUI" ;
	}
    
    @RequestMapping(value = "/add",method = RequestMethod.POST)
	public String add(moveBooking moveBooking,Model model) {
//    	System.out.println(moveBooking);
    	moveBooking.setStaus(0);
    	moveBookingService.insert(moveBooking);
		return "redirect:/list" ;
	}
    
}
