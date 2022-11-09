package nLayeredHomework;

import nLayeredHomework.business.CategoryManager;
import nLayeredHomework.core.Logger;
import nLayeredHomework.core.MailLogger;
import nLayeredHomework.dataAccess.abstracts.CategoryDao;
import nLayeredHomework.dataAccess.concretes.HibernateCategoryDao;
import nLayeredHomework.entities.Category;
import nLayeredHomework.entities.Course;
import nLayeredHomework.entities.İnstructor;

public class Main {

	public static void main(String[] args) {
		Category category = new Category(1,"Backend");
		Course course = new Course(1,25,"Java ile Backend");
		İnstructor instructor = new İnstructor(1,"Engin","Demiroğ");
		Logger logger = new MailLogger();
		
		logger.log(category.getCategoryName());
		
	
	}


}
