package com.srinath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.srinath.interfaceandimplements.SuplierDao;
import com.srinath.pojo.Product;
import com.srinath.pojo.Supplier;

@Controller
public class SupplierController
{
@Autowired
SuplierDao sd;
    
    
@RequestMapping("/supplier")
public ModelAndView toSupplierJsp()
{
	
    ModelAndView m1= new ModelAndView("enterandshowsupplier","sup",new Supplier());
    List supplierData=sd.fromDatabase();
    m1.addObject("sd",supplierData);
return m1;
}


@RequestMapping(value="/savesupplier",method=RequestMethod.POST )

public ModelAndView savesupplier(@ModelAttribute("sup") Supplier supplier)
{
    sd.insert(supplier);
    List supplierData=sd.fromDatabase();
    return new ModelAndView("enterandshowsupplier","sd",supplierData);
}
@RequestMapping("/delsupplier")
public ModelAndView delete(@RequestParam("supId") int ProductId)
{
	sd.delete(ProductId);
	ModelAndView mv=new ModelAndView("enterandshowsupplier","sup",new Supplier()); 
	List productList=sd.fromDatabase();
	mv.addObject("sd",productList);
return mv;
}
}