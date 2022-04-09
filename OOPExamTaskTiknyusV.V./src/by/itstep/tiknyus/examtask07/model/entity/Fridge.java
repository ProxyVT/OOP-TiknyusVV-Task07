package by.itstep.tiknyus.examtask07.model.entity;

import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;

public class Fridge extends Device {
	private String energyRathing;
	private int shelves;

	public Fridge() {
		super();
	}

	public Fridge(String energyRathing, int shelves, double weight, double price, boolean socketStatus, 
			int power) {
		super(weight, price, socketStatus, power);
		this.energyRathing = energyRathing;
		this.shelves = shelves;
	}

	public String getenergyRathing() {
		return energyRathing;
	}

	public void setenergyRathing(String energyRathing) {
		this.energyRathing = energyRathing;
	}

	public int getShelves() {
		return shelves;
	}

	public void setShelves(int shelves) {
		if (shelves > 0) {
			this.shelves = shelves;
		}

	}

	@Override
	public String toString() {
		return "Fridge \t\t energy rathing = " + energyRathing + "\n\t\t freezer shelves = " + shelves + "" + super.toString();
	}

}
