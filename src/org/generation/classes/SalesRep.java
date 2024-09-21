package org.generation.classes;

public class SalesRep extends Employee{
	private double salesMade;

	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}

	public SalesRep(String firstName, String lastName, int registration, double salesMade) {
		super(firstName, lastName, registration);
		this.salesMade = salesMade;
		// TODO Auto-generated constructor stub
	}

	public double getSalesMade() {
		return salesMade;
	}

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	}
	
	public double calculateComission() {
		double comission = 0.1 * this.salesMade;
		return comission;
	}
	

}
