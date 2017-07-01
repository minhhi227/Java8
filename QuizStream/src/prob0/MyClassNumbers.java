package prob0;

public class MyClassNumbers {
	private int first;
	private int second;
	private Compute compute;
	
	public MyClassNumbers(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	public Compute getCompute() {
		return compute;
	}

	public void setCompute(Compute compute) {
		this.compute = compute;
	}

	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public int add(){
		return Compute.add(this.getFirst(), this.getSecond());
	}
	
	public int mulptiply(){
		compute = new Multiply();
		return compute.operation(this.getFirst(), this.getSecond());
	}
	public int divide(){
		compute = new Divide();
		return compute.operation(this.getFirst(), this.getSecond());
	}
	
}
