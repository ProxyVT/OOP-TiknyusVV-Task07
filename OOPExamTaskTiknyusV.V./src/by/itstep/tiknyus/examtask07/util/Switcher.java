package by.itstep.tiknyus.examtask07.util;

import java.util.Scanner;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.logic.Calculator;
import by.itstep.tiknyus.examtask07.model.logic.Searcher;
import by.itstep.tiknyus.examtask07.model.logic.Sorter;
import by.itstep.tiknyus.examtask07.view.Printer;
import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;

public class Switcher implements Data {

	private static Scanner scanner;

	static {
		scanner = new Scanner(System.in);
	}

	public static int index;
	public static int count;

	static void exitProgramm() {
		System.exit(0);
	}

	public static void switcher(Apartment apartment) {
		Printer.print(Data.FIRST_INITIALIZATION);
		index = scanner.nextInt();
		switch (index) {
		case Data.CREATE_DEVICES:
			Printer.print("\nYour number: ");
			count = scanner.nextInt();
			if (count <= 0) {
				Printer.print(Data.ERROR_MESSAGE);
				switcher(apartment);
			} else
				apartment = DeviceCreator.create(count);
			Printer.print(apartment);
			switcherNextStep(apartment);
			break;
		case Data.EXIT_PROGRAMM_STEP_ONE:
			exitProgramm();
		default:
			Printer.print(Data.ERROR_MESSAGE);
			switcher(apartment);
			break;
		}
	}

	public static void switcherNextStep(Apartment apartment) {
		Printer.print(Data.SECOND_INITIALIZATION);
		index = scanner.nextInt();
		switch (index) {
		case Data.CALCULATE_DEVICES:
			switcherCalculator(apartment);
			break;
		case Data.SEARCH_DEVICES:
			switcherSearcherMaxMin(apartment);
			break;
		case Data.SORT_DEVICES:
			switcherSorterAscDesc(apartment);
			break;
		case Data.QUIT_PROGRAMM:
			exitProgramm();
			break;
		case Data.BACKWARD:
			Printer.print("Your number: ");
			count = scanner.nextInt();
			if (count <= 0) {
				Printer.print(Data.ERROR_MESSAGE);
				switcherNextStep(apartment);
			} else
				apartment = DeviceCreator.create(count);
			Printer.print(apartment);
			switcherNextStep(apartment);
			break;
		default:
			Printer.print(Data.ERROR_MESSAGE);
			switcherNextStep(apartment);
			break;
		}
	}

	public static void switcherCalculator(Apartment apartment) {
		Printer.print(Data.CALCULATOR_INITIALIZATION);
		index = scanner.nextInt();
		switch (index) {
		case Data.TOTAL_POWER:
			int powerTotal = Calculator.calcTotalPower(apartment);
			Printer.print("\nTotal power consumption: = " + powerTotal);
			switcherCalculator(apartment);
			break;
		case Data.PLUGGED_IN:
			int powerPluggedIn = Calculator.calcPluggedInPower(apartment);
			Printer.print("\nPlugged in power consumption: = " + powerPluggedIn);
			switcherCalculator(apartment);
			break;
		case Data.TWO_VALUES:
			int powerAll = Calculator.calcTotalPower(apartment);
			int powerAllPluggedIn = Calculator.calcPluggedInPower(apartment);
			Printer.print("\nTotal power consumption: = " + powerAll + "\nPlugged in power consumption: = "
					+ powerAllPluggedIn);
			switcherCalculator(apartment);
			break;
		case Data.BACK:
			switcherNextStep(apartment);
			break;
		default:
			Printer.print(Data.ERROR_MESSAGE);
			switcherCalculator(apartment);
			break;
		}

	}

	public static void switcherSearcherMaxMin(Apartment apartment) {
		Printer.print(Data.SEARCHER_TYPE_INITIALIZATION);
		index = scanner.nextInt();
		switch (index) {
		case Data.MAX:
			switcherSearcherMax(apartment);
			break;
		case Data.MIN:
			switcherSearcherMin(apartment);
			break;
		default:
			Printer.print(Data.ERROR_MESSAGE);
			switcherSearcherMaxMin(apartment);
			break;
		}

	}

	public static void switcherSearcherMax(Apartment apartment) {
		Printer.print(Data.SEARCHER_INITIALIZATION);
		index = scanner.nextInt();
		switch (index) {
		case Data.PRICE:
			Device maxPrice = new Device();
			maxPrice = Searcher.getMaxPriceDevice(apartment);
			Printer.print("\n\nDevice with max. price = \n" + maxPrice);
			switcherSearcherMax(apartment);
			break;
		case Data.WEIGHT:
			Device maxWeight = new Device();
			maxWeight = Searcher.getMaxWeightDevice(apartment);
			Printer.print("\n\nDevice with max. weight = \n" + maxWeight);
			switcherSearcherMax(apartment);
			break;
		case Data.POWER_CONSUMPTION:
			Device maxPower = new Device();
			maxPower = Searcher.getMaxPowerDevice(apartment);
			Printer.print("\n\nDevice with max. power consumption = \n" + maxPower);
			switcherSearcherMax(apartment);
			break;
		case Data.BACK:
			switcherNextStep(apartment);
			break;
		default:
			Printer.print(Data.ERROR_MESSAGE);
			switcherSearcherMax(apartment);
			break;
		}

	}

	public static void switcherSearcherMin(Apartment apartment) {
		Printer.print(Data.SEARCHER_INITIALIZATION);
		index = scanner.nextInt();
		switch (index) {
		case Data.PRICE:
			Device minPrice = new Device();
			minPrice = Searcher.getMinPriceDevice(apartment);
			Printer.print("\n\nDevice with min. price = \n" + minPrice);
			switcherSearcherMin(apartment);
			break;
		case Data.WEIGHT:
			Device minWeight = new Device();
			minWeight = Searcher.getMinWeightDevice(apartment);
			Printer.print("\n\nDevice with min. weight = \n" + minWeight);
			switcherSearcherMin(apartment);
			break;
		case Data.POWER_CONSUMPTION:
			Device minPower = new Device();
			minPower = Searcher.getMinPowerDevice(apartment);
			Printer.print("\n\nDevice with min. power consumption = \n" + minPower);
			switcherSearcherMin(apartment);
			break;
		case Data.BACK:
			switcherNextStep(apartment);
			break;
		default:
			Printer.print(Data.ERROR_MESSAGE);
			switcherSearcherMin(apartment);
			break;
		}

	}

	public static void switcherSorterAscDesc(Apartment apartment) {
		Printer.print(Data.SORTER_TYPE_INITIALIZATION);
		index = scanner.nextInt();
		switch (index) {
		case Data.MAX:
			switcherSorterAsc(apartment);
			break;
		case Data.MIN:
			switcherSorterDesc(apartment);
			break;
		default:
			Printer.print(Data.ERROR_MESSAGE);
			switcherSorterAscDesc(apartment);
			break;
		}

	}

	public static void switcherSorterAsc(Apartment apartment) {
		Printer.print(Data.SORTER_INITIALIZATION);
		index = scanner.nextInt();
		switch (index) {
		case Data.PRICE:
			Sorter.sortByPriceAsc(apartment);
			Printer.print(apartment);
			switcherSorterAsc(apartment);
			break;
		case Data.WEIGHT:
			Sorter.sortByWeightAsc(apartment);
			Printer.print(apartment);
			switcherSorterAsc(apartment);
			break;
		case Data.POWER_CONSUMPTION:
			Sorter.sortByPowerConsumptionAsc(apartment);
			Printer.print(apartment);
			switcherSorterAsc(apartment);
			break;
		case Data.NAME:
			Sorter.sortByNameAsc(apartment);
			Printer.print(apartment);
			switcherSorterAsc(apartment);
			break;
		case Data.BACKWARD:
			switcherNextStep(apartment);
			break;
		default:
			Printer.print(Data.ERROR_MESSAGE);
			switcherSorterAsc(apartment);
			break;
		}

	}

	public static void switcherSorterDesc(Apartment apartment) {
		Printer.print(Data.SORTER_INITIALIZATION);
		index = scanner.nextInt();
		switch (index) {
		case Data.PRICE:
			Sorter.sortByPriceDesc(apartment);
			Printer.print(apartment);
			switcherSorterDesc(apartment);
			break;
		case Data.WEIGHT:
			Sorter.sortByWeightDesc(apartment);
			Printer.print(apartment);
			switcherSorterDesc(apartment);
			break;
		case Data.POWER_CONSUMPTION:
			Sorter.sortByPowerConsumptionDesc(apartment);
			Printer.print(apartment);
			switcherSorterDesc(apartment);
			break;
		case Data.NAME:
			Sorter.sortByNameAsc(apartment);
			Printer.print(apartment);
			switcherSorterDesc(apartment);
			break;
		case Data.BACKWARD:
			switcherNextStep(apartment);
			break;
		default:
			Printer.print(Data.ERROR_MESSAGE);
			switcherSorterDesc(apartment);
			break;
		}

	}

}