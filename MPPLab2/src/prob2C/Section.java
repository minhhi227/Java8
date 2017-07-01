package prob2C;

import java.util.ArrayList;
import java.util.List;

public class Section {
	private String sectionName;
	private List<Student> students;
	
	public Section(String sectionName, Student student) {
		this.sectionName = sectionName;
		this.students = new ArrayList<Student>();
		this.students.add(student);
	}
	
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public List<Student> getStudent() {
		return students;
	}
	public void setStudent(List<Student> student) {
		this.students = student;
	}
	
}
