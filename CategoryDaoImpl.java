package com.srinath.interfaceandimplements;

import java.security.CryptoPrimitive;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.srinath.pojo.Category;
@Component
@Repository
public class CategoryDaoImpl implements CategoryDao 
{
@Autowired
SessionFactory sf;


	public boolean insert(Category category) 
	{
		
		category.setCategoryId((int)(Math.random()*100000));
		Session session=sf.openSession();
		session.save(category);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
		return true;
	}

	public List fromDatabase() 
	{
		Session session=sf.openSession();
		Query query=session.createQuery("From Category");
		List categorydata=query.list();
		return categorydata;
	}

	
	public boolean delete(int categoryId) 
	{
		try
		{
		Session session=sf.openSession();
		Category category=(Category)session.get(Category.class, categoryId);
		session.delete(category);
		Transaction t=session.beginTransaction();
		t.commit();
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}

}
