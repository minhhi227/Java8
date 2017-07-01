package Problem5.Exam;

public class CS implements Graduate
{
	int fee;
	int courses;
	public CS(int f,int c)
	{
		fee=f;
		courses=c;
	}
	
	public void setCourses(int courses) {
		this.courses = courses;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	// You can add your code here
	@Override
	public int scholarships() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int feeCal() {
		// TODO Auto-generated method stub
		return this.getFee()*this.getCourse()+1500;
	}
	@Override
	public int getFee() {
		// TODO Auto-generated method stub
		return fee;
	}
	@Override
	public int getCourse() {
		// TODO Auto-generated method stub
		return courses;
	}
	
}
