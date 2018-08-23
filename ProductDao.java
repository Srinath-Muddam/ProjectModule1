package com.srinath.interfaceandimplements;

import java.util.List;

import com.srinath.pojo.Product;

public interface ProductDao 
{
boolean insert(Product product);
List fromDatabase(); 
boolean delete(int productId);
Product edit(int productId);
Product details(int productId);
}
