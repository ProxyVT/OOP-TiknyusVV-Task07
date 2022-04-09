package by.itstep.tiknyus.examtask07.model.logic;

import by.itstep.tiknyus.examtask07.model.entity.Apartment;
import by.itstep.tiknyus.examtask07.model.entity.abstracts.Device;
import by.itstep.tiknyus.examtask07.model.exception.DeviceIndexOutOfBoundException;

public class Sorter {
	

	// Weight sorting
	public static void sortByWeightAsc(Apartment apartment) {
		try {
			for (int i = 0; i < apartment.getDeviceSize() - 1; i++) {
				for (int j = 0; j < apartment.getDeviceSize() - 1 - i; j++) {
					if (apartment.get(j).getWeight() > apartment.get(j + 1).getWeight()) {
						Device temp = apartment.get(j);
						apartment.set(j, apartment.get(j + 1));
						apartment.set(j + 1, temp);
					}
				}
			}
		} catch (DeviceIndexOutOfBoundException exception) {
			// ...
		}
	}

	public static void sortByWeightDesc(Apartment apartment) {
		try {
			for (int i = 0; i < apartment.getDeviceSize() - 1; i++) {
				for (int j = 0; j < apartment.getDeviceSize() - 1 - i; j++) {
					if (apartment.get(j).getWeight() < apartment.get(j + 1).getWeight()) {
						Device temp = apartment.get(j);
						apartment.set(j, apartment.get(j + 1));
						apartment.set(j + 1, temp);
					}
				}
			}
		} catch (DeviceIndexOutOfBoundException exception) {
			// ...
		}
	}

	// Price sorting
	public static void sortByPriceAsc(Apartment apartment) {
		try {
			for (int i = 0; i < apartment.getDeviceSize() - 1; i++) {
				for (int j = 0; j < apartment.getDeviceSize() - 1 - i; j++) {
					if (apartment.get(j).getPrice() > apartment.get(j + 1).getPrice()) {
						Device temp = apartment.get(j);
						apartment.set(j, apartment.get(j + 1));
						apartment.set(j + 1, temp);
					}
				}
			}
		} catch (DeviceIndexOutOfBoundException exception) {
			// ...
		}
	}

	public static void sortByPriceDesc(Apartment apartment) {
		try {
			for (int i = 0; i < apartment.getDeviceSize() - 1; i++) {
				for (int j = 0; j < apartment.getDeviceSize() - 1 - i; j++) {
					if (apartment.get(j).getPrice() < apartment.get(j + 1).getPrice()) {
						Device temp = apartment.get(j);
						apartment.set(j, apartment.get(j + 1));
						apartment.set(j + 1, temp);
					}
				}
			}
		} catch (DeviceIndexOutOfBoundException exception) {
			// ...
		}
	}

	// Power consumption sorting
	public static void sortByPowerConsumptionAsc(Apartment apartment) {
		try {
			for (int i = 0; i < apartment.getDeviceSize() - 1; i++) {
				for (int j = 0; j < apartment.getDeviceSize() - 1 - i; j++) {
					if (apartment.get(j).getPowerConsumption() > apartment.get(j + 1).getPowerConsumption()) {
						Device temp = apartment.get(j);
						apartment.set(j, apartment.get(j + 1));
						apartment.set(j + 1, temp);
					}
				}
			}
		} catch (DeviceIndexOutOfBoundException exception) {
			// ...
		}
	}

	public static void sortByPowerConsumptionDesc(Apartment apartment) {
		try {
			for (int i = 0; i < apartment.getDeviceSize() - 1; i++) {
				for (int j = 0; j < apartment.getDeviceSize() - 1 - i; j++) {
					if (apartment.get(j).getPowerConsumption() < apartment.get(j + 1).getPowerConsumption()) {
						Device temp = apartment.get(j);
						apartment.set(j, apartment.get(j + 1));
						apartment.set(j + 1, temp);
					}
				}
			}
		} catch (DeviceIndexOutOfBoundException exception) {
			// ...
		}
	}
	
	// Name sorting
	public static void sortByNameAsc(Apartment apartment) {
		try {
			for (int i = 0; i < apartment.getDeviceSize() - 1; i++) {
				for (int j = 0; j < apartment.getDeviceSize() - 1 - i; j++) {
					if (apartment.get(j).toString().compareTo(apartment.get(j + 1).toString()) > 0) {
						Device temp = apartment.get(j);
						apartment.set(j, apartment.get(j + 1));
						apartment.set(j + 1, temp);
					}
				}
			}
		} catch (DeviceIndexOutOfBoundException exception) {
			// ...
		}
	}
	
	public static void sortByNameDesc(Apartment apartment) {
		try {
			for (int i = 0; i < apartment.getDeviceSize() - 1; i++) {
				for (int j = 0; j < apartment.getDeviceSize() - 1 - i; j++) {
					if (apartment.get(j).toString().compareTo(apartment.get(j + 1).toString()) < 0) {
						Device temp = apartment.get(j);
						apartment.set(j, apartment.get(j + 1));
						apartment.set(j + 1, temp);
					}
				}
			}
		} catch (DeviceIndexOutOfBoundException exception) {
			// ...
		}
	}

}
