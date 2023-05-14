package coordinator.domain;

import java.util.List;

public class FigureFactory {
	private static final int TRIANGLE_SIZE = 3;
	private static final int RECTANGLE_SIZE = 4;

	public static Figure create(List<Coordinate> coordinates) {
		if (coordinates.size() == TRIANGLE_SIZE) {

		}
		if (coordinates.size() == RECTANGLE_SIZE) {
			return new Rectangle(coordinates);
		}
		throw new IllegalArgumentException("유효하지 않는 도형입니다.");
	}
}
