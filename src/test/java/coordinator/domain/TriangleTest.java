package coordinator.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void 삼각형_이름() {
		Coordinate c1 = new Coordinate(0, 0);
		Coordinate c2 = new Coordinate(4, 0);
		Coordinate c3 = new Coordinate(0, 5);

		Triangle triangle = new Triangle(Lists.newArrayList(c1, c2, c3));

		Assertions.assertThat(triangle.name()).isEqualTo("삼각형");
	}

	@Test
	void 삼각형_넓이_구하기() {
		Coordinate c1 = new Coordinate(10, 10);
		Coordinate c2 = new Coordinate(14, 15);
		Coordinate c3 = new Coordinate(20, 8);

		Triangle triangle = new Triangle(Lists.newArrayList(c1, c2, c3));

		Assertions.assertThat(triangle.area()).isEqualTo(29.0, Offset.offset(0.9));
	}
}
