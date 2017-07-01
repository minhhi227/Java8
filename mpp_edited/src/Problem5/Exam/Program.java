package Problem5.Exam;

import java.util.ArrayList;
import java.util.List;

public class Program 
{
	private String name;
	List<Student> stdlst;
	public Program(String n)
	{
		name=n;
		stdlst = new ArrayList<Student>();
	}
	
// You can write any method required here
	
 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStdlst() {
		return stdlst;
	}

	public void setStdlst(List<Student> stdlst) {
		this.stdlst = stdlst;
	}
public void addStd(Student s){
	this.stdlst.add(s);
}
public List<Student> getstdlst(){
	return this.stdlst;
}
public static int totalFee(List<Student> stds){
	int sum = 0;
	for(Student s : stds){
		sum+=s.getGrd().feeCal();
	}
	return sum;
}
public static void main(String args[])
  {
			 Program p=new Program("Data Science Program");
			 Student std1=new Student("Mahd",1,new CS(4,4));
			 Student std2=new Student("Davis",1,new CS(3,2));
			 Student std3=new Student("Rick",1,new MIS(3,3));
			 p.addStd(std1);
			 p.addStd(std2);
			 p.addStd(std3);
			 System.out.println("Total fee:"+Program.totalFee(p.getstdlst()));
  }

}
