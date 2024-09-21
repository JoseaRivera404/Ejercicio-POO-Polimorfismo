package org.generation;

import org.generation.classes.SalesManager;
import org.generation.classes.SalesRep;

public class Main {
	
	public static void main(String[] Args) {
		SalesManager manager = new SalesManager("Ernesto", "Juarez", 120, 30, 660, 1, 250.10, 5, 120.00);
		SalesRep rep1 = new SalesRep("Donovan", "Romero", 200, 50.99);
		SalesRep rep2 = new SalesRep("Jose", "Rivera", 201, 80.99);
		
		System.out.println(manager);
		System.out.println("Time to retirement " + manager.timeToRetirement() + " years");
		System.out.println("Vacation time left " + manager.vacationTimeLeft() + " days");
		System.out.println("Bonus " + manager.calculateBonus());
		System.out.println("Comission " + manager.calculateComission());
		manager.addSalesTeam(rep1);
		manager.addSalesTeam(rep2);
		System.out.println("Comission " + manager.calculateComission());
		System.out.println("Comission " + rep1.calculateComission());
		System.out.println("Comission " + rep2.calculateComission());
//		System.out.println(rep1);
		
	}
	
}
