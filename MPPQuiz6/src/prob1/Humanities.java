package prob1;

import java.util.List;

public class Humanities implements Department {

	private List<Program> program;

	public List<Program> getProgram() {
		return program;
	}

	public void setProgram(List<Program> program) {
		this.program = program;
	}

	
	public Humanities() {
	}

	public Humanities(List<Program> program) {
		this.program = program;
	}

	@Override
	public Integer getEnroll() {
		// TODO Auto-generated method stub
		Integer sum =0 ;
		for(Program pr: this.getProgram()){
			sum+=pr.getEnroll();
		}
		return sum;
	}
	
}
