package com.net.ShoppingFrontend.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.net.ShoppingBackend.dao.CategoryDao;
import com.net.ShoppingBackend.dao.ProductDao;
import com.net.ShoppingBackend.dao.UserDao;
import com.net.ShoppingBackend.model.User;


@Controller
public class HomeController {
	
@Autowired
	ProductDao productDao;
	@Autowired
	HttpSession httpSession;
	@Autowired
	CategoryDao categoryDao;
	@Autowired
	UserDao userDao;

	@RequestMapping("/")
	public String homePage(Model model)
	{
	
		httpSession.setAttribute("categoryList",categoryDao.listAllCategory());
		httpSession.setAttribute("productList",productDao.listAllProduct());
		return "index";
	}
	@RequestMapping("/admin")
	public String admin(Model model)
	{
		return "admin";
	}
	@RequestMapping(value="/productdetail/{cat_id}",method=RequestMethod.GET)
	public String productDetail(@PathVariable("cat_id") String cat_id,Model model)
	{
		model.addAttribute("productList",productDao.getproductByCategory(cat_id));
		return "productdetail";
	}
	@RequestMapping("/register") 
	public String register(@ModelAttribute("reg")User user,Model model) {
		 model.addAttribute("reg",user);
		return "register";
	}
	@PostMapping(value="/register")
	public String addUser(@ModelAttribute("reg")User user,Model model)
	{
		userDao.addUser(user);
		return "register";
	}

}
