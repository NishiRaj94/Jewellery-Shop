package com.net.ShoppingFrontend.controller;

import java.util.List;


import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.net.ShoppingBackend.dao.CategoryDao;
import com.net.ShoppingBackend.model.Category;
@Controller
public class CategoryController {
	@Autowired(required=true)
	 Category category;
	@Autowired
	 CategoryDao categoryDao;
	@RequestMapping("/category")
	 public String category(Model model) {
	 model.addAttribute("Category",category);
	 model.addAttribute("categoryList",categoryDao.listAllCategory());
		return "category";
	}
	
@RequestMapping(value="/addCategory", method=RequestMethod.POST)
 public String addCategory(@ModelAttribute("Category") Category category,Model model)
{
	if(category.getCat_id()==null)
	categoryDao.addCategory(category );
	else
		categoryDao.updateCategory(category);
	 return "category";
}
@RequestMapping("/updateCategory/{cat_id}")
public String updateCategory(@PathVariable("cat_id") String cat_id,Model model) {
	//categoryDao.updateCategory(cat_id);
	System.out.println("in update controller");
	model.addAttribute("Category",categoryDao.getCategory(cat_id));
	model.addAttribute("categoryList",categoryDao.listAllCategory());
	return "category";
}
	@RequestMapping("/deleteCategory/{cat_id}")

public String deleteCategory(@PathVariable("cat_id") String cat_id,Model model) {
		categoryDao.deleteCategory(cat_id);
return "redirect:/category";

	}
}
