package by.itstep.tiknyus.examtask07.model.entity;

import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;

public class Kettle extends Device {
	private String colour;
	private boolean dryProtection;

	public Kettle() {
		super();
	}

	public Kettle(String colour, boolean dryProtection, double weight, double price, boolean socketStatus, int power) {
		super(weight, price, socketStatus, power);
		this.colour = colour;
		this.dryProtection = dryProtection;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isDryProtection() {
		return dryProtection;
	}

	public String dryDryProtectionStatus(boolean dryCondition) {
		String condition = dryCondition ? "yes" : "no";
		return condition;
	}

	public void setDryProtection(boolean dryProtection) {
		this.dryProtection = dryProtection;
	}

	@Override
	public String toString() {
		return "Kettle \t\t colour = " + colour + "\n\t\t dry protection = " + dryDryProtectionStatus(dryProtection)
				+ "" + super.toString();
	}

}
