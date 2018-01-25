package ua.nure.nikonova.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ua.nure.nikonova.model.User;
import ua.nure.nikonova.service.UserService;


@Controller
@RequestMapping("/users")
public class UserController {
	 
	@Autowired
	private UserService servise;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody 
	List getAllUsers() {
		return servise.getAllUsers();
	} 
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin() {
		
			ModelAndView m = new ModelAndView();
			m.addObject("userFromServer", new User());
			m.setViewName("login");
			return m;
	
	}
	
	@RequestMapping(value = "/check", method = RequestMethod.POST)
	public @ResponseBody String checkUser(@ModelAttribute User user) {
		if ("admin".equals(user.getName())
				&&"admin".equals(user.getPassword())) {
		
			return "valid";
			
		}
		return "invalid";
		
	}
	


	

}
