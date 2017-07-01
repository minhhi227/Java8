package prob1;

public class Researchprofile extends Graduate {
	private Integer course;

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}
	
	@Override
	public boolean checkCondition() {
		if(this.getCourse()>=22) return true;
		else return false;

	}
}
