package by.itstep.tiknyus.examtask07.model.entity;

import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;

public class Microwave extends Device {
	private double capacity;
	private String fitType;

	public Microwave() {
		super();
	}

	public Microwave(double capacity, String fitType, double weight, double price, boolean socketStatus,
			int power) {
		super(weight, price, socketStatus, power);
		this.capacity = capacity;
		this.fitType = fitType;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		if (capacity > 0) {
			this.capacity = capacity;
		}
	}

	public String getFitType() {
		return fitType;
	}

	public void setFitType(String fitType) {
		this.fitType = fitType;
	}

	@Override
	public String toString() {
		return "Microwave \t capacity = " + capacity + "\n\t\t fit type = " + fitType + "" + super.toString();
	}

}
