package nLayeredHomework.dataAccess.concretes;

import nLayeredHomework.dataAccess.abstracts.CategoryDao;
import nLayeredHomework.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate İle eklendi" + category.getCategoryName());
		
	}

}
