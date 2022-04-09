package by.itstep.tiknyus.examtask07.controller;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.util.Switcher;
import by.itstep.tiknyus.examtask07.view.Printer;

public class Main {

	public static void main(String[] args) {
		Printer.print("Welcome to programme 'House Equipments'. Follow instructions below: \n\n");
		Apartment apartment = new Apartment();

		Switcher.switcher(apartment); // Execution of a switcher block with
										// the output of the result to the console
	}

}
