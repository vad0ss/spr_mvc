package com.springapp.mvc;

import hibernate.entities.UserEntity;
import hibernate.services.UserServices;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) throws SQLException {

		String username = null;

		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
		UserServices service = (UserServices) context.getBean("storageService");

		for (UserEntity content : service.getUser()) {
			username = content.getUsername();
		}

		model.addAttribute("message", "Monaco V");
		model.addAttribute("username", username);

        return "hello";
	}
}