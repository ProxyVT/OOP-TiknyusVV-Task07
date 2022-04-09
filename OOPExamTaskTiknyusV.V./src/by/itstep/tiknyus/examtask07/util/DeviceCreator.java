package by.itstep.tiknyus.examtask07.util;

import java.util.Random;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;
import by.itstep.tiknyus.examtask07.model.entity.Fridge;
import by.itstep.tiknyus.examtask07.model.entity.Kettle;
import by.itstep.tiknyus.examtask07.model.entity.Microwave;

public class DeviceCreator implements Data {

	public static final int DEVICE_COUNT = 3;

	private static Random random;

	static {
		random = new Random();
	}

	public static Apartment create(int count) {
		Apartment apartment = new Apartment();

		for (int i = 0; i < count; i++) {
			apartment.add(getDevice());
		}

		return apartment;
	}

	public static Device getTypeDevice(int type) {

		String energyRathing = Data.energy[random.nextInt(Data.energy.length)];
		int shelves = random.nextInt(Data.MAX_FRIDGE_FREEZER_SHELVES);
		double weightFrdige = random.nextDouble()
				* (Data.MAX_FRIDGE_WEIGHT_KILLOGRAMM - Data.MIN_FRIDGE_WEIGHT_KILLOGRAMM + 1);
		int powerFridge = random.nextInt(Data.MAX_FRIDGE_POWER_WATTS);
		boolean socketStatus = random.nextBoolean();

		double price = random.nextDouble() * (Data.MAX_DEVICE_PRICE_DOLLAR - Data.MIN_DEVICE_PRICE_DOLLAR + 1);

		Device device = new Fridge(energyRathing, shelves, weightFrdige, price, socketStatus, powerFridge);

		switch (type) {
		case 0: {

			String color = Data.colour[random.nextInt(Data.colour.length)];
			boolean dryProtection = random.nextBoolean();
			double weightKettle = random.nextDouble()
					* (Data.MAX_KETTLE_WEIGHT_KILLOGRAMM - Data.MIN_KETTLE_WEIGHT_KILLOGRAMM + 1);
			int powerKettle = random.nextInt(Data.MAX_KETTLE_POWER_WATTS);

			device = new Kettle(color, dryProtection, weightKettle, price, socketStatus, powerKettle);
		}
			break;
		case 1: {

			double capacity = random.nextDouble()
					* (Data.MAX_MICROWAVE_CAPACITY_LITER - Data.MIN_MICROWAVE_CAPACITY_LITER + 1);
			String fitType = Data.fit[random.nextInt(Data.fit.length)];
			double weightMicrowave = random.nextDouble()
					* (Data.MAX_MICROWAVE_WEIGHT_KILLOGRAMM - Data.MIN_MICROWAVE_WEIGHT_KILLOGRAMM + 1);
			int powerMicrowave = random.nextInt(Data.MAX_MICROWAVE_POWER_WATTS);

			device = new Microwave(capacity, fitType, weightMicrowave, price, socketStatus, powerMicrowave);
		}
			break;
		}

		return device;
	}

	private static Device getDevice() {
		int type = random.nextInt(DEVICE_COUNT);
		return getTypeDevice(type);
	}

}
