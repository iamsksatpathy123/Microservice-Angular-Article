package com.article.user.service;

import java.util.List;

import com.article.user.entity.Category;

public interface ICategoryService {
	boolean createCategory(Category category);
	 List<Category> getAllCategory();
	 void updateCategory(Category category);
	 void deleteCategory(int categoryId);
	 Category getCategoryById(int categoryId);
	
}
