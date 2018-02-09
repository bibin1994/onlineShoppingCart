package org.bibin.onlineshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.bibin.onlineshoppingbackend.dao.CategoryDao;
import org.bibin.onlineshoppingbase.dto.Category;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionfactory;
	
	private static  List<Category> categories=new ArrayList<Category>();
	
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
		Category category1=new Category();
		category1.setId(2);
		category1.setName("Mobile");
		category1.setDescription("This is a product of Mobile");
		category1.setImageURL(" ");
		category1.setActive(true);
		categories.add(category1);
		
//		Third  product
		Category category2=new Category();
		category2.setId(3);
		category2.setName("Laptop");
		category2.setDescription("This is a product of Laptop");
		category2.setImageURL(" ");
		category2.setActive(true);
		categories.add(category2);
		
//		Fourth product
		Category category3=new Category();
		category3.setId(4);
		category3.setName("Electronic");
		category3.setDescription("This is a product of electronics");
		category3.setImageURL(" ");
		category3.setActive(true);
		categories.add(category3);
		
	}
	
	
	
	public List<Category> list() {
		
		return categories;
	}



	public Category get(int id) {
		
		for(Category categroy:categories)
		{
			if(categroy.getId()==id)
			{
				return  categroy;
			}
		}
		
		return null;
	}



	public boolean add(Category category) {
		
		try {
			
			sessionfactory.getCurrentSession().persist(category);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		return false;
	}

}
