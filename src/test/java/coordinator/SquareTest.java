package coordinator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void 사각형의_면적을_구한다() {
		Coordinate c1 = new Coordinate(0, 0);
		Coordinate c2 = new Coordinate(4, 0);
		Coordinate c3 = new Coordinate(0, 5);
		Coordinate c4 = new Coordinate(4, 6);

		Square square = new Square(c1, c3, c2, c4);

		Assertions.assertThat(square.area()).isEqualTo(20);
	}
}
