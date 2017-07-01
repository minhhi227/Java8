package prob2A;

public class Student {
	private String name;
	private GradeReport gr;
	
	Student(){
		gr = new GradeReport(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GradeReport getGr() {
		return gr;
	}

	public void setGr(GradeReport gr) {
		this.gr = gr;
	}
	
	
}


