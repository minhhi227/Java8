package prob1;

import java.util.List;

public class University {
	private List<Department> departments;


	public University(List<Department> departments) {
		this.departments = departments;
	}
	
	public List<Department> getDepartments() {
		return departments;
	}



	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}



	public Integer getEnroll(){
		Integer sum = 0;
		for(Department dept: this.getDepartments()){
			sum+=dept.getEnroll();
		}
		//System.out.println(sum);
		return sum;
	}

}
