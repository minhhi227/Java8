package prob2;

public class Main {

	public static void main(String[] args) {

		Landlord lanlord = new Landlord();

		Building building1 = new Building(300);
		Apartment apartment1 = new Apartment(1500);
		Apartment apartment2 = new Apartment(2500);
		building1.getApartments().add(apartment1);
		building1.getApartments().add(apartment2);

		Building building2 = new Building(500);
		apartment1 = new Apartment(3500);
		apartment2 = new Apartment(4500);
		building2.getApartments().add(apartment1);
		building2.getApartments().add(apartment2);

		lanlord.getBuildings().add(building1);
		lanlord.getBuildings().add(building2);

		System.out.println("Total profits: " + calculateMonthlyTotalProfits(lanlord));
	}

	static double calculateMonthlyTotalProfits(final Landlord lanlord) {
		double totalProfits = 0;
		for(Building building : lanlord.getBuildings()) {
			totalProfits += building.monthlyTotalProfits();
		}
		return totalProfits;
	}

}
