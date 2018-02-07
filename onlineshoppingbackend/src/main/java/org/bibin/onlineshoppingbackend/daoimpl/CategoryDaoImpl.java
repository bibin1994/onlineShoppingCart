package org.bibin.onlineshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.bibin.onlineshoppingbackend.dao.CategoryDao;
import org.bibin.onlineshoppingbase.dto.Category;

public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories=new ArrayList<Category>();
	
	static 
	{   
//		first product
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is a product of television");
		category.setImageURL(" ");
		category.setActive(true);
		categories.add(category);
		
//		Second product
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is a product of Mobile");
		category.setImageURL(" ");
		category.setActive(true);
		categories.add(category);
		
//		Third  product
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is a product of Laptop");
		category.setImageURL(" ");
		category.setActive(true);
		categories.add(category);
		
//		Fourth product
		category.setId(4);
		category.setName("Electronic");
		category.setDescription("This is a product of electronics");
		category.setImageURL(" ");
		category.setActive(true);
		categories.add(category);
		
	}
	
	
	
	public List<Category> list() {
		
		return categories;
	}

}
