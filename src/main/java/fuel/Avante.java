package fuel;

public class Avante extends Car {
	private static final int FUEL_EFFICIENCY = 15;

	public Avante(int distance) {
		super(distance);
	}

	@Override
	double getDistancePerLiter() {
		return FUEL_EFFICIENCY;
	}

	@Override
	double getTripDistance() {
		return this.distance;
	}

	@Override
	String getName() {
		return this.getClass().getSimpleName();
	}
}
