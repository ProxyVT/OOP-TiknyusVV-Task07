package by.itstep.tiknyus.examtask07.model.logic;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;
import by.itstep.tiknyus.examtask07.model.exception.DeviceIndexOutOfBoundException;

public class Calculator {

	// Power calculation
	public static int calcTotalPower(Apartment apartment) {
		int total = 0;

		try {
			for (int i = 0; i < apartment.getDeviceSize(); i++) {
				Device device = apartment.get(i);
				total += device.getPowerConsumption();
			}

		} catch (DeviceIndexOutOfBoundException exc) {
			System.err.println(exc);
		}

		return total;
	}

	public static int calcPluggedInPower(Apartment apartment) {

		int pluggedIn = 0;

		try {
			for (int i = 0; i < apartment.getDeviceSize(); i++) {
				Device device = apartment.get(i);
				if (device.isSocketStatus()) {
					pluggedIn += device.getPowerConsumption();
				}
			}
		} catch (DeviceIndexOutOfBoundException exc) {
			System.err.println(exc);
		}

		return pluggedIn;
	}

}
