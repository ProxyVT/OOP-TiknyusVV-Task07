package by.itstep.tiknyus.examtask07.model.entity;

import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;
import by.itstep.tiknyus.examtask07.model.exception.DeviceIndexOutOfBoundException;

public class Apartment {
	private Device[] devices;

	public Apartment() {
		devices = new Device[0];
	}

	public Apartment(Device[] devices) {
		super();
		this.devices = devices;
	}

	public Device get(int index) throws DeviceIndexOutOfBoundException {
		if (index >= 0 && index < devices.length) {
			return devices[index];
		} else {
			throw new DeviceIndexOutOfBoundException();
		}
	}

	public void set(int index, Device device) throws DeviceIndexOutOfBoundException {
		if (index >= 0 && index < devices.length && device != null) {
			devices[index] = device;
		} else {
			throw new DeviceIndexOutOfBoundException();
		}

	}

	public int getDeviceSize() {
		return devices.length;
	}

	public void switchToType(Device device) {
		int index = 0;
		switch (index) {
		case 1:
			device.getWeight();
			break;
		case 2:
			device.getPrice();
			break;
		case 3:
			device.getPowerConsumption();
			break;

		default:
			device.toString();
			break;
		}
	}

	public void add(Device device) {
		Device[] temp = new Device[devices.length + 1];
		int i = 0;
		for (; i < devices.length; i++) {
			temp[i] = devices[i];
		}
		temp[i] = device;
		devices = temp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("\n");

		for (Device device : devices) {
			builder.append(device).append("\n");
		}

		return builder.toString();
	}

}
