package com.article.user.repo;
import java.util.List;

import com.article.user.entity.Category;



public interface ICategoryDAO {
   
	void createCategory(Category category);
	 List<Category> getAllCategory();
	 void updateCategory(Category category);
	 void deleteCategory(int categoryId);
	 Category getCategoryById(int categoryId);
	 boolean categoryExists(String category);

}
