package coordinator;

import java.util.Objects;

import javax.xml.validation.Validator;

public class Point {
	private static final int MAX_LIMIT = 24;
	private static final int MIN_LIMIT = 0;
	private final int value;

	public Point(int value) {
		validate(value);
		this.value = value;
	}
	private void validate(int value) {
		if (value > MAX_LIMIT) {
			throw new IllegalArgumentException("24를 초과할 수 없습니다.");
		}
		if (value < MIN_LIMIT) {
			throw new IllegalArgumentException("0 미만이 될 수 없습니다.");
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Point point = (Point)o;
		return value == point.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
