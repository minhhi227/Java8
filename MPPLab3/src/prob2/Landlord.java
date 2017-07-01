package prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	private List<Building> buildings;

	public Landlord() {
		super();
		buildings = new ArrayList<Building>();
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}

}
