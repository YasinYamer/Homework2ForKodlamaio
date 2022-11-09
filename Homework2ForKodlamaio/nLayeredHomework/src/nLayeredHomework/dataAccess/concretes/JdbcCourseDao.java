package nLayeredHomework.dataAccess.concretes;

import nLayeredHomework.dataAccess.abstracts.CourseDao;
import nLayeredHomework.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc İle eklendi" + course.getCourseName());
		
	}

}
