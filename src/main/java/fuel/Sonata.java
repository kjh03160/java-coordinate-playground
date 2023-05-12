package fuel;

public class Sonata extends Car {
	private static final int FUEL_EFFICIENCY = 10;
	public Sonata(int distance) {
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
