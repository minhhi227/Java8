package prob1;

import java.util.List;

public class DepartmentFactory {
	
	public Department getDepartment(String departmentType, List<Program> program ){
		if(departmentType == null){
			return null;
		}
		if(departmentType.equalsIgnoreCase("ARTS")){
			return new Arts(program);
		}
		else if(departmentType.equalsIgnoreCase("COMPUTERSCIENCE")){
			return new ComputerScience(program);
		}
		else if(departmentType.equalsIgnoreCase("HUMANITIES")){
			return new Humanities(program);
		}
		else if(departmentType.equalsIgnoreCase("MANAGEMENTSCIENCE")){
			return new ManagementScience(program);
		}
		
		return null;
	}
}
