package nLayeredHomework.dataAccess.concretes;

import nLayeredHomework.dataAccess.abstracts.İnstructorDao;
import nLayeredHomework.entities.İnstructor;

public class HibernateİnstructorDao implements İnstructorDao {

	@Override
	public void add(İnstructor instructor) {
		System.out.println("Hibernate İle eklendi" + instructor.getInstructorName());
		
	}

}
