package coordinator;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void 두_점_사이의_거리를_계산한다() {
		double result = Calculator.calculateDistance(new Coordinate(10, 10), new Coordinate(14, 15));
		Assertions.assertThat(result).isEqualTo(6.403124, Offset.offset(0.00099));
	}

	@Test
	void 사각형의_면적을_계산한다() {
		double result = Calculator.calculateArea(10, 5);
		Assertions.assertThat(result).isEqualTo(50);
	}
}
