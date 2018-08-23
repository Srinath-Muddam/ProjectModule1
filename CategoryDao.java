package com.srinath.interfaceandimplements;

import java.util.List;

import com.srinath.pojo.Category;

public interface CategoryDao 
{
boolean insert(Category category);
List fromDatabase();
boolean delete(int categoryId);
}
