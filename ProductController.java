package com.srinath.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.srinath.interfaceandimplements.ProductDao;
import com.srinath.pojo.Category;
import com.srinath.pojo.Product;

@Controller
public class ProductController 
{
	
@Autowired
ProductDao pd;

	@RequestMapping("/product")
	public ModelAndView toProductJsp()
	{

	ModelAndView m1=new ModelAndView("enterandshowproduct","pro",new Product());
	List productData=pd.fromDatabase();
	m1.addObject("pd",productData);
	return m1;
		
	}
	@RequestMapping(value="/saveproduct",method=RequestMethod.POST)
	public ModelAndView toDaoAndTable(@ModelAttribute("pro") Product product) throws Exception
	{
		MultipartFile image=product.getProductImage();
		File file=new File("D:\\Workspace-Photon\\MavenWebSpringMvcAndHibernate\\src\\main\\resources\\qwe.jpg");
		
		
		FileOutputStream fos=new FileOutputStream(file);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		bos.write(image.getBytes());
	
		pd.insert(product);
		List productData=pd.fromDatabase();
		return new ModelAndView("enterandshowproduct","pd",productData);
	
}
	@RequestMapping("/prodelete")
	public ModelAndView delete(@RequestParam("proId") int ProductId)
	{
		pd.delete(ProductId);
		ModelAndView mv=new ModelAndView("enterandshowproduct","pro",new Product()); 
		List productList=pd.fromDatabase();
		mv.addObject("pd",productList);
	return mv;
	}
	@RequestMapping("editpro")
	public ModelAndView edit(@RequestParam("proId") int ProductId)
	{
		Product p=pd.edit(ProductId);
		ModelAndView mv=new ModelAndView("enterandshowproduct","pro",p);
		return mv;
	}
	}
	
	
	
	
