package com.angular;

//import org.springframework.stereotype.Controller;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class angularController {

	@RequestMapping(value="/user/delUser")
	public ModelAndView delUser(){
		String result ="this is delUser------";
		return new ModelAndView("/welcome","result",result);
	}
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView toIndex(){
		String result ="this is delUser------";
		return new ModelAndView("/static/000","result",result);
	}
	@RequestMapping(value="/details")
	public ModelAndView toDetails(HttpServletRequest request ){
		String id=request.getParameter("ID");
		System.out.println(id);
		String result ="this is details";
		return new ModelAndView("/details","id",id);
	}
}
