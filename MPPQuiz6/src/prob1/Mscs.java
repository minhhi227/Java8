package prob1;

import java.util.List;

public class Mscs implements Program {

private List<Student> students;
    
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	
	public Mscs() {
	}

	public Mscs(List<Student> students) {
		this.students = students;
	}

	@Override
	public Integer getEnroll() {
		// TODO Auto-generated method stub
		return this.getStudents().size();
	}
	

}
