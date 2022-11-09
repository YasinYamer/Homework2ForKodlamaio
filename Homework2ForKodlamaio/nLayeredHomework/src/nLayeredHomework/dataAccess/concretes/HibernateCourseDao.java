package nLayeredHomework.dataAccess.concretes;

import nLayeredHomework.dataAccess.abstracts.CourseDao;
import nLayeredHomework.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate İle eklendi" + course.getCourseName());
		
	}

}
