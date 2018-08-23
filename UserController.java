package com.srinath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.srinath.interfaceandimplements.ProductDao;
import com.srinath.pojo.Product;

@Controller
public class UserController
{
	@Autowired
	ProductDao pd;
@RequestMapping("/details")
ModelAndView mv(@RequestParam("proId") int pro)
{
	Product product=pd.details(pro);
	
	ModelAndView mv=new ModelAndView("userproducts","p",product);
	
	return mv;
}
}
