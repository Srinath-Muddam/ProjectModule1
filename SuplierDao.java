package com.srinath.interfaceandimplements;

import java.util.List;

import com.srinath.pojo.Category;
import com.srinath.pojo.Supplier;

public interface SuplierDao 
{
boolean insert(Supplier supplier);
List fromDatabase();
boolean delete(int supplierId);
}
