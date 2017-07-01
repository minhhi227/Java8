package prob1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s1 = new Student(001, "Minh Hieu Nguyen", "Vietnam", 27, new Status("Active"));
		Student s2 = new Student(002, "Philip", "Myanma", 27, new Status("Active"));
		Student s3 = new Student(003, "Vichrak", "Cambodia", 27, new Status("Active"));
		
		List<Student> ls1 = new ArrayList<Student>();
		ls1.add(s1);
		ls1.add(s2);
		List<Student> ls2 = new ArrayList<Student>();
		ls2.add(s2);
		ls2.add(s3);
		List<Student> ls3 = new ArrayList<Student>();
		ls3.add(s1);
		ls3.add(s3);
		
		ProgramFactory pf = new ProgramFactory();
		List<Program> programList1 = new ArrayList<Program>();
		programList1.add(pf.getProgram("BS", ls1));
		programList1.add(pf.getProgram("MSCS", ls3));
		
		List<Program> programList2 = new ArrayList<Program>();
		programList2.add(pf.getProgram("MBA", ls2));
		programList2.add(pf.getProgram("VEDIC", ls3));
		
		DepartmentFactory df = new DepartmentFactory();
		
		List<Department> departments = new ArrayList<Department>();
		Department d1 = df.getDepartment("COMPUTERSCIENCE",programList1 );
		Department d2 = df.getDepartment("MANAGEMENTSCIENCE",programList2 );

		
		departments.add(d1);
		departments.add(d2);
		
		University university = new University(departments);
        System.out.println(university.getEnroll());
		
	}

}
