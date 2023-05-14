package coordinator.domain;

import java.util.List;
import java.util.Objects;

public class Rectangle extends AbstractFigure {
	private static final String NAME = "사각형";
	private Coordinate leftDownCoordinate;
	private Coordinate leftUpCoordinate;
	private Coordinate rightDownCoordinate;
	private Coordinate rightUpCoordinate;

	public Rectangle(List<Coordinate> coordinates) {
		sort(coordinates);
		validate(coordinates);
		this.leftDownCoordinate = coordinates.get(0);
		this.rightDownCoordinate = coordinates.get(1);
		this.leftUpCoordinate = coordinates.get(2);
		this.rightUpCoordinate = coordinates.get(3);
	}

	@Override
	public String name() {
		return NAME;
	}

	@Override
	public double area() {
		return Calculator.calculateDistance(leftDownCoordinate, rightDownCoordinate)
			* Calculator.calculateDistance(leftDownCoordinate, leftUpCoordinate);
	}

	private void validate(List<Coordinate> coordinates) {
		if (coordinates.size() < 4) {
			throw new IllegalArgumentException("4개의 좌표가 필요합니다.");
		}
		Coordinate leftDown = coordinates.get(0);
		Coordinate rightDown = coordinates.get(1);
		Coordinate leftUp = coordinates.get(2);
		Coordinate rightUP = coordinates.get(3);

		if (!(leftDown.getX().equals(leftUp.getX()) && leftDown.getY().equals(rightDown.getY())
			&& leftUp.getY().equals(rightUP.getY()) && rightUP.getX().equals(rightDown.getX()))) {
			throw new IllegalArgumentException("직사각형이 아닙니다.");
		}
	}

	private void sort(List<Coordinate> coordinates) {
		coordinates.sort((o1, o2) -> {
			if (o1.getX().extract(o2.getX()) > 0) {
				return 1;
			}
			if (o1.getY().extract(o2.getY()) > 0) {
				return 1;
			}
			return -1;
		});
	}

	Coordinate getLeftDownCoordinate() {
		return leftDownCoordinate;
	}

	Coordinate getLeftUpCoordinate() {
		return leftUpCoordinate;
	}

	Coordinate getRightDownCoordinate() {
		return rightDownCoordinate;
	}

	Coordinate getRightUpCoordinate() {
		return rightUpCoordinate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Rectangle rectangle = (Rectangle)o;
		return Objects.equals(leftDownCoordinate, rectangle.leftDownCoordinate)
			&& Objects.equals(leftUpCoordinate, rectangle.leftUpCoordinate)
			&& Objects.equals(rightDownCoordinate, rectangle.rightDownCoordinate)
			&& Objects.equals(rightUpCoordinate, rectangle.rightUpCoordinate);
	}

	@Override
	public int hashCode() {
		return Objects.hash(leftDownCoordinate, leftUpCoordinate, rightDownCoordinate, rightUpCoordinate);
	}
}
