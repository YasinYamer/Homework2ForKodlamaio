package nLayeredHomework.entities;

public class İnstructor {
	private int instructorId;
	private String instructorName;
	private String instructorSurname;
	
	
	public İnstructor(int instructorId, String instructorName, String instructorSurname) {
		super();
		this.instructorId = instructorId;
		this.instructorName = instructorName;
		this.instructorSurname = instructorSurname;
	}


	public int getInstructorId() {
		return instructorId;
	}


	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}


	public String getInstructorName() {
		return instructorName;
	}


	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}


	public String getInstructorSurname() {
		return instructorSurname;
	}


	public void setInstructorSurname(String instructorSurname) {
		this.instructorSurname = instructorSurname;
	}
	
	
}
