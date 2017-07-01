package prob1;

public class Student {
	private Integer id;
	private String name;
	private String nationality;
	private Integer age;
	private Status status;
	
	
	public Student() {
	}
	
	public Student(Integer id, String name, String nationality, Integer age, Status status) {
		this.id = id;
		this.name = name;
		this.nationality = nationality;
		this.age = age;
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
}
