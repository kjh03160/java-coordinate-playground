package fuel;

public class K5 extends Car {
	private static final int FUEL_EFFICIENCY = 13;
	public K5(int distance) {
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
