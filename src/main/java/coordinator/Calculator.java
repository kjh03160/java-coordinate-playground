package coordinator;

public class Calculator {
	public static double calculateDistance(Coordinate c1, Coordinate c2) {
		return Math.sqrt(extractAndSquare(c1.getX(), c2.getX()) + extractAndSquare(c1.getY(), c2.getY()));
	}

	public static double calculateArea(double width, double height) {
		return width *  height;
	}

	private static double extractAndSquare(Point p1, Point p2) {
		return Math.pow(p1.extract(p2), 2);
	}
}
