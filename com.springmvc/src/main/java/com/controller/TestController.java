package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping(value="/demo",method=RequestMethod.GET)
	public ModelAndView jump(){
		System.out.println("进来啦。。亲！");
		String str = "first spring mvc demo!";
		return new ModelAndView("demo", "message", str);
	}

}
