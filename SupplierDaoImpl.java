package com.srinath.interfaceandimplements;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.srinath.pojo.Category;
import com.srinath.pojo.Supplier;
@Component
@Repository
public class SupplierDaoImpl implements SuplierDao
{
@Autowired
SessionFactory sf;

	public boolean insert(Supplier supplier)
	
	{
		supplier.setSupplierId((int)(Math.random()*100000));
Session session=sf.openSession();
session.save(supplier);
Transaction transaction=session.beginTransaction();
transaction.commit();
		return true;
	}

	public List fromDatabase() 
	{
		Session session=sf.openSession();
		Query query=session.createQuery("from Supplier");
		List supplierdata=query.list();
		
		return supplierdata;
	}


	public boolean delete(int supplierId) {
		Session session=sf.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class, supplierId);
		session.delete(supplier);
		Transaction t=session.beginTransaction();
		t.commit();
		return true;
		
	}

}
