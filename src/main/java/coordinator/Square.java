package coordinator;

public class Square {
	private Coordinate leftDownCoordinate;
	private Coordinate leftUpCoordinate;
	private Coordinate rightDownCoordinate;
	private Coordinate rightUpCoordinate;

	public Square(Coordinate leftDownCoordinate, Coordinate leftUpCoordinate, Coordinate rightDownCoordinate, Coordinate rightUpCoordinate) {
		this.leftDownCoordinate = leftDownCoordinate;
		this.leftUpCoordinate = leftUpCoordinate;
		this.rightDownCoordinate = rightDownCoordinate;
		this.rightUpCoordinate = rightUpCoordinate;
	}

	public double area() {
		return Calculator.calculateDistance(leftDownCoordinate, rightDownCoordinate)
			* Calculator.calculateDistance(leftDownCoordinate, leftUpCoordinate);
	}
}
