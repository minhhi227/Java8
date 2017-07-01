package prob26;

public abstract class Car {
	private String model;
    abstract void printPrice();
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
