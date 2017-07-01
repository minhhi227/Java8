package prob1;

import java.util.List;

public class ProgramFactory {

	public Program getProgram(String programType, List<Student> students){
		if(programType == null){
			return null;
		}
		if(programType.equalsIgnoreCase("BS")){
			return new Bs(students);
		}
		else if(programType.equalsIgnoreCase("MBA")){
			return new Mba(students);
		}
		else if(programType.equalsIgnoreCase("MSCS")){
			return new Mscs(students);
		}
		else if(programType.equalsIgnoreCase("VEDIC")){
			return new Vedic(students);
		}
		
		return null;
	}
}
