package nLayeredHomework.business;

import nLayeredHomework.core.Logger;
import nLayeredHomework.dataAccess.abstracts.CourseDao;
import nLayeredHomework.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	public void add (Course course) throws Exception{
		if (course.getCourseName() == course.getCourseName()) {
			throw new Exception("Course name cannot be the same");
		}
		if (course.getCoursePrice()<0) {
			throw new Exception("Course price cannot be the zero and below zero");
		}
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		courseDao.add(course);
	}

}
