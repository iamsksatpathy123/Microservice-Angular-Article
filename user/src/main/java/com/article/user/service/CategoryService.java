package com.article.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.article.user.entity.Category;
import com.article.user.repo.ICategoryDAO;
@Service
public class CategoryService implements ICategoryService{
@Autowired
private ICategoryDAO categoryDAO;
	
	@Override
	public boolean createCategory(Category category) {
		if (categoryDAO.categoryExists(category.getCategoryname())) {
	    	   return false;
	       }else {
	    	   System.out.println("category nhi hai service");
	    	   categoryDAO.createCategory(category);
	    	   return true;
	       }
		
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryDAO.getAllCategory();
	}

	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		categoryDAO.updateCategory(category);
	}

	@Override
	public void deleteCategory(int categoryId) {
		categoryDAO.deleteCategory(categoryId);
		
	}

	@Override
	public Category getCategoryById(int categoryId) {
		Category obj = categoryDAO.getCategoryById(categoryId);
		return obj;
	}

	

}
