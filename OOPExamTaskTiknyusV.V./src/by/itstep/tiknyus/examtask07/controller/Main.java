package by.itstep.tiknyus.examtask07.controller;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.util.Switcher;
import by.itstep.tiknyus.examtask07.view.Printer;

public class Main {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		Printer.print("Welcome to programme 'House Equipments'. Follow instructions below: \n\n" + "Chose your action: "
				+ "\n1. Input number of devices" + "\n2. Exit programm\n");

		Apartment apartment = new Apartment();
		Switcher.switcher(apartment);

//		Switcher.switcherSecondStep(apartment);
		
//		Switcher.switcherCalculator(apartment);

//		Printer.print("Input first nubmer");
		// Devices shown
//		int count = scanner.nextInt();
//		Apartment apartment = DeviceCreator.create(count);
//		Printer.print(apartment);
//		
//		
//		Printer.print("\n\nSorting asc: \n");
//        Sorter.sortByNameAsc(apartment);
//        Printer.print(apartment);
//        
//        Printer.print("\nSorting desc: \n");
//        Sorter.sortByNameDesc(apartment);
//        Printer.print(apartment);
//        
//        Printer.print("\nSorting: \n");
//        Searcher.searchName(apartment);;
//        Printer.print(apartment);

//        Printer.print("\nMax price: \n");
//		Device maxPrice = new Device();
//		maxPrice = Calculator.getMaxPriceDevice(apartment);
//        Printer.print("\n\nDevice with max price = \n" + maxPrice);

	}

}
