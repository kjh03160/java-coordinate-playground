package coordinator.domain;

public class Coordinate {
	private final Point x;
	private final Point y;

	public Coordinate(int x, int y) {
		this.x = new Point(x);
		this.y = new Point(y);
	}

	public double distanceFrom(Coordinate coordinate) {
		return Calculator.calculateDistance(this, coordinate);
	}

	Point getX() {
		return x;
	}

	Point getY() {
		return y;
	}
}
