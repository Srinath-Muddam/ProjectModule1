package com.srinath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.srinath.interfaceandimplements.CategoryDao;
import com.srinath.pojo.Category;

@Controller
public class CategoryController
{
	@Autowired
	CategoryDao cd;

@RequestMapping("/category")
public ModelAndView toCategoryJsp()
{

ModelAndView m1=new ModelAndView("enterandshowcategory","cat",new Category());

List categoryData=cd.fromDatabase();
m1.addObject("cd", categoryData);
return m1;
	
}
@RequestMapping("/savecategory")
public ModelAndView toDaoAndTable(@ModelAttribute("cat") Category category)
{
	
	cd.insert(category);
	List categoryData=cd.fromDatabase();
	return new ModelAndView("enterandshowcategory","cd",categoryData);
	
}
@RequestMapping("/deletecat")
public ModelAndView deleteCategory(@RequestParam("catid") int categoryId)
{
	cd.delete(categoryId);
	List categoryData=cd.fromDatabase();
	ModelAndView mv=new ModelAndView("enterandshowcategory","cat",new Category());
	mv.addObject("cd",categoryData);
return mv;
}
}
