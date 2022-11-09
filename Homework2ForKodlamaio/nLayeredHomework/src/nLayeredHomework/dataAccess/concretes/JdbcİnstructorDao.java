package nLayeredHomework.dataAccess.concretes;

import nLayeredHomework.dataAccess.abstracts.İnstructorDao;
import nLayeredHomework.entities.İnstructor;

public class JdbcİnstructorDao implements İnstructorDao {

	@Override
	public void add(İnstructor instructor) {
		System.out.println("Jdbc İle eklendi" + instructor.getInstructorName());
		
	}

}
