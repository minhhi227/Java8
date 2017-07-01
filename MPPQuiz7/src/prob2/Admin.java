package prob2;

public class Admin {
	//implement
	private Department[] depts;
	
	public Admin(Department[] depts) {
		this.depts = depts;
	}

	public Department[] getDepts() {
		return depts;
	}

	public void setDepts(Department[] depts) {
		this.depts = depts;
	}

	public String format(String name,String msg){
		StringBuilder str = new StringBuilder();
		str.append(name);
		str.append(": ");
		str.append(msg);
		str.append("\n");
		return str.toString();
	}
	
	public String hourlyCompanyMessage(){
		StringBuilder str = new StringBuilder();
		
		for(Department d : depts){
			str.append(this.format(d.getName(), d.nextMessage()));
		}
		
		return str.toString();
	}
	
	
}
