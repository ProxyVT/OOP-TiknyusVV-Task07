import by.itstep.tiknyus.examtask07.*;
import by.itstep.tiknyus.examtask07.model.entity.Fridge;
import by.itstep.tiknyus.examtask07.model.entity.Kettle;
import by.itstep.tiknyus.examtask07.model.entity.Microwave;
import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;
import by.itstep.tiknyus.examtask07.model.logic.Calculator;
import by.itstep.tiknyus.examtask07.model.logic.Searcher;
import by.itstep.tiknyus.examtask07.util.Data;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Assert.*;
import org.junit.Test;

public class Testing {
	@Test
	public void testCalcTotalPowerConsumption() {
		Apartment apartment = new Apartment();

		apartment.add(new Fridge("'A++'", 9, 8, 500, true, 20));
		apartment.add(new Microwave(15, "'Built In'", 15, 200, false, 1400));
		apartment.add(new Kettle("'White'", true, 1.2, 50, true, 150));

		int expected = 1570;

		int actual = Calculator.calcTotalPower(apartment);

		assertEquals(expected, actual, 0);

	}

	@Test
	public void testCalcTotalPowerConsumptionPluggedIn() {
		Apartment apartment = new Apartment();

		apartment.add(new Fridge("'A++'", 9, 8, 500, true, 20));
		apartment.add(new Microwave(15, "'Built In'", 15, 200, false, 1400));
		apartment.add(new Kettle("'White'", true, 1.2, 50, true, 150));

		int expected = 170;

		int actual = Calculator.calcPluggedInPower(apartment);

		assertEquals(expected, actual, 0);

	}

	@Test
	public void testMaxPowerConsumption() {
		Apartment apartment = new Apartment();
		apartment.add(new Fridge("'A++'", 9, 8, 500, true, 20));
		apartment.add(new Microwave(15, "'Built In'", 15, 200, false, 1400));
		apartment.add(new Kettle("'White'", true, 1.2, 50, true, 150));		

		double excpected = 1400;
		Device actual = new Device();
		actual = Searcher.getMaxPowerDevice(apartment);

		assertEquals(excpected, actual.getPowerConsumption(), 0);

	}
	
	@Test
	public void testMinPowerConsumption() {
		Apartment apartment = new Apartment();
		apartment.add(new Fridge("'A++'", 9, 8, 500, true, 20));
		apartment.add(new Microwave(15, "'Built In'", 15, 200, false, 1400));
		apartment.add(new Kettle("'White'", true, 1.2, 50, true, 150));		

		double excpected = 20;
		Device actual = new Device();
		actual = Searcher.getMinPowerDevice(apartment);

		assertEquals(excpected, actual.getPowerConsumption(), 0);

	}
	
	@Test
	public void testMaxPrice() {
		Apartment apartment = new Apartment();
		apartment.add(new Fridge("'A++'", 9, 8, 500, true, 20));
		apartment.add(new Microwave(15, "'Built In'", 15, 200, false, 1400));
		apartment.add(new Kettle("'White'", true, 1.2, 50, true, 150));		

		double excpected = 500;
		Device actual = new Device();
		actual = Searcher.getMaxPriceDevice(apartment);

		assertEquals(excpected, actual.getPrice(), 0);

	}
	
	@Test
	public void testMinPrice() {
		Apartment apartment = new Apartment();
		apartment.add(new Fridge("'A++'", 9, 8, 500, true, 20));
		apartment.add(new Microwave(15, "'Built In'", 15, 200, false, 1400));
		apartment.add(new Kettle("'White'", true, 1.2, 50, true, 150));		

		double excpected = 50;
		Device actual = new Device();
		actual = Searcher.getMinPriceDevice(apartment);

		assertEquals(excpected, actual.getPrice(), 0);

	}
	
	@Test
	public void testMaxWeight() {
		Apartment apartment = new Apartment();
		apartment.add(new Fridge("'A++'", 9, 8, 500, true, 20));
		apartment.add(new Microwave(15, "'Built In'", 15, 200, false, 1400));
		apartment.add(new Kettle("'White'", true, 1.2, 50, true, 150));

		double excpected = 15;
		Device actual = new Device();
		actual = Searcher.getMaxWeightDevice(apartment);

		assertEquals(excpected, actual.getWeight(), 0);

	}
	
	@Test
	public void testMinWeight() {
		Apartment apartment = new Apartment();
		apartment.add(new Fridge("'A++'", 9, 8, 500, true, 20));
		apartment.add(new Microwave(15, "'Built In'", 15, 200, false, 1400));
		apartment.add(new Kettle("'White'", true, 1.2, 50, true, 150));		

		double excpected = 1.2;
		Device actual = new Device();
		actual = Searcher.getMinWeightDevice(apartment);

		assertEquals(excpected, actual.getWeight(), 0);

	}
	
}
