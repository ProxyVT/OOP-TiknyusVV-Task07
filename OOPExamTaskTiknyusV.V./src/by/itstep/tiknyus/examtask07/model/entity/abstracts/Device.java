package by.itstep.tiknyus.examtask07.model.entity.abstracts;

public class Device {
	private double weight;
	private double price;
	private boolean socketStatus;
	private int power;

	public Device() {
	}

	public Device(double weight, double price, boolean socketStatus, int power) {
		super();
		this.weight = weight;
		this.price = price;
		this.socketStatus = socketStatus;
		this.power = power;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isSocketStatus() {
		return socketStatus;
	}

	public String socketCondition(boolean socketStatus) {
		String condition = socketStatus ? "yes" : "no";
		return condition;
	}

	public void setSocketStatus(boolean socketStatus) {
		this.socketStatus = socketStatus;
	}

	public int getPowerConsumption() {
		return power;
	}

	public void setPowerConsumption(int powerConsumption) {
		this.power = powerConsumption;
	}

	@Override
	public String toString() {
		return " \n\t\t weight = " + weight + "\n\t\t price = " + price + " \n\t\t plugged in = "
				+ socketCondition(socketStatus) + " \n\t\t power = " + power + "\n";
	}

}
