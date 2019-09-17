package com.article.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.article.user.entity.Category;
import com.article.user.service.CategoryService;

public class TestLogic {
	@Autowired
	private CategoryService i;
 
	  @Test  
	    public void testFindCategory(){  
		
		  String expectedName = "Nero";
		  assertEquals(expectedName, Category.getCategoryNameWithcategory());
		}
	  
	
}
