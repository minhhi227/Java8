package prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {

	private double maintenanceCosts;
	private List<Apartment> apartments;

	public Building() {
		super();
	}

	public Building(double maintenaceCosts) {
		super();
		this.maintenanceCosts = maintenaceCosts;
		apartments = new ArrayList<Apartment>();
	}

	public double getMaintenanceCosts() {
		return maintenanceCosts;
	}

	public void setMaintenanceCosts(double maintenanceCosts) {
		this.maintenanceCosts = maintenanceCosts;
	}


	public List<Apartment> getApartments() {
		return apartments;
	}

	public void setApartments(List<Apartment> apartments) {
		this.apartments = apartments;
	}
	
	public double monthlyTotalProfits(){
		double profits = 0;
		for(Apartment apartment : this.getApartments()) {
			profits += apartment.getRent();
		}
		profits -= this.getMaintenanceCosts();
		
		return profits;
	}

}
