package com.srinath.interfaceandimplements;

import java.util.List;

import javax.persistence.Entity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.srinath.pojo.Product;
@Entity
@Repository
public class ProductDaoImpl implements ProductDao
{
@Autowired
SessionFactory sf;

	public boolean insert(Product product) 
	{   
		//int p=product.getProductId();
		//String n=product.getProductName();
		//System.out.println("value="+n);
		
		product.setProductId((int)(Math.random()*100000));
		Session session=sf.openSession();
		session.saveOrUpdate(product);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return true;
		}
		
	
	public List fromDatabase() {
		
		Session session=sf.openSession();
		Query query=session.createQuery("from Product");
		List productdata=query.list();
		return productdata;
	}


	public boolean delete(int productId) 
	{
		Session session=sf.openSession();
		Product product=(Product)session.get(Product.class,productId);
		session.delete(product);
	Transaction transaction=session.beginTransaction();
	
	transaction.commit();
		return true;
	}

	
	public Product edit(int productId) 
	{
		Session session=sf.openSession();
		Product product=(Product)session.get(Product.class,productId);
		
		return product;
	}


	
	public Product details(int productId) {
		Session session=sf.openSession();
		Product product=(Product)session.get(Product.class,productId);
		return product;
	}

}
