package nLayeredHomework.dataAccess.concretes;

import nLayeredHomework.dataAccess.abstracts.CategoryDao;
import nLayeredHomework.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc İle eklendi" + category.getCategoryName());
		
	}

}
