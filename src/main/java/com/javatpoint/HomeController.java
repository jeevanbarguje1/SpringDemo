package com.javatpoint;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	private final Logger logger = LogManager.getLogger(HomeController.class);

	
	@RequestMapping("/welcome")
	public String index() {
		return "welcome";
	}

	@RequestMapping("/index")
	public String index1() {
		return "index";
	}


	@RequestMapping(value = "/save1", method = RequestMethod.POST)
	public ModelAndView saveIndex(@ModelAttribute User user) {
		logger.info("welcome to logger");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index-data");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
	@RequestMapping(value = "/save2", method = RequestMethod.POST)
	public ModelAndView saveWelcome(@ModelAttribute Employee emp) {
		logger.info("welcome to logger");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("welcome-data");
		modelAndView.addObject("emp", emp);
		return modelAndView;
	}
}