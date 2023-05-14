package coordinator.domain;

import java.util.List;

public class Triangle extends AbstractFigure {
	private static final String NAME = "삼각형";
	private List<Coordinate> coordinates;

	public Triangle(List<Coordinate> coordinates) {
		if (coordinates.size() != 3) {
			throw new IllegalArgumentException("3개의 좌표가 필요합니다");
		}
		this.coordinates = coordinates;
	}

	@Override
	public String name() {
		return NAME;
	}

	@Override
	public double area() {
		Coordinate c1 = coordinates.get(0);
		Coordinate c2 = coordinates.get(1);
		Coordinate c3 = coordinates.get(2);

		double distance1 = c1.distanceFrom(c2);
		double distance2 = c1.distanceFrom(c3);
		double distance3 = c3.distanceFrom(c2);

		double s = (distance1 + distance2 + distance3) / 2;

		return Math.sqrt(s * (s - distance1) * (s - distance2) * (s - distance3));
	}
}
