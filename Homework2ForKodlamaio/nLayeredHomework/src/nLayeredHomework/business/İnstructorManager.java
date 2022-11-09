package nLayeredHomework.business;

import nLayeredHomework.core.Logger;
import nLayeredHomework.dataAccess.abstracts.İnstructorDao;
import nLayeredHomework.entities.Course;

public class İnstructorManager {
	private İnstructorDao instructorDao;
	private Logger[] loggers;

	public İnstructorManager(İnstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	
	
}
