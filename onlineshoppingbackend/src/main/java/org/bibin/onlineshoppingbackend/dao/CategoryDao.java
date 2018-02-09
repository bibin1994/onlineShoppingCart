package org.bibin.onlineshoppingbackend.dao;
import java.util.List;

import org.bibin.onlineshoppingbase.dto.*;

public interface CategoryDao {

	public boolean add(Category category);
	public  List<Category> list();
	public   Category get(int id);
	
}
