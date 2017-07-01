package prob2C;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Section> sections;
	
	public Student(String name) {
		this.name = name;
	}

	public Student(String name, String sectionName) {
		this.name = name;
		this.sections = new ArrayList<Section>();
		this.sections.add(new Section(sectionName,this));
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Section> getSection() {
		return sections;
	}
	public void setSection(List<Section> section) {
		this.sections = section;
	}
	
}
