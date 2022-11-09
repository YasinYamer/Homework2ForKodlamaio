package nLayeredHomework.business;

import nLayeredHomework.core.Logger;
import nLayeredHomework.dataAccess.abstracts.CategoryDao;
import nLayeredHomework.entities.Category;

public class CategoryManager {
	private Logger[] loggers;
	private CategoryDao  categoryDao;
	
	public CategoryManager(Logger[] loggers, CategoryDao categoryDao) {
		super();
		this.loggers = loggers;
		this.categoryDao = categoryDao;
	}
	
	public void check(Category category)  throws Exception{
		if (category.getCategoryName() == category.getCategoryName()) {
			throw new Exception("Category name cannot be the same");
		}
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}
}
