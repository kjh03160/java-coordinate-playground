package fuel;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
	private final static String NEW_LINE = "\n";
	private final List<Car> cars = new ArrayList<>();
	public static RentCompany create() {
		return new RentCompany();
	}

	public void addCar(Car car) {
		this.cars.add(car);
	}

	public String generateReport() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Car car : this.cars) {
			stringBuilder.append(car.report());
			stringBuilder.append(NEW_LINE);
		}
		return stringBuilder.toString();
	}
}
