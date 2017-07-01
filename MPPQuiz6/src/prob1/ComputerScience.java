package prob1;

import java.util.List;

public class ComputerScience implements Department{
	private List<Program> program;

	public List<Program> getProgram() {
		return program;
	}

	public void setProgram(List<Program> program) {
		this.program = program;
	}
	
	

	public ComputerScience() {
	}

	public ComputerScience(List<Program> program) {
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
