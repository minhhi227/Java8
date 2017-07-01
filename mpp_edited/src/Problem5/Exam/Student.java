package Problem5.Exam;

public class Student 
{
  String name;
  int id;
  private Graduate grd;
  
//  You can define any Data member or Method here
  public Student(String n,int i,Graduate g)
  {
	  name=n;
	  id=i;
	  grd=g;
  }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Graduate getGrd() {
	return grd;
}

public void setGrd(Graduate grd) {
	this.grd = grd;
}
  
  
  
}
