package coordinator.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

class FigureFactoryTest {

	@Test
	void 점이_4개이면_사각형을_생성한다() {
		Coordinate c1 = new Coordinate(0, 0);
		Coordinate c2 = new Coordinate(4, 0);
		Coordinate c3 = new Coordinate(0, 5);
		Coordinate c4 = new Coordinate(4, 5);

		Figure figure = FigureFactory.create(Lists.newArrayList(c1, c2, c3, c4));

		Assertions.assertThat(figure).isEqualTo(new Rectangle(Lists.newArrayList(c1, c2, c3, c4)));
	}

	@Test
	void 점이_3개이면_삼각형을_생성한다() {
		Coordinate c1 = new Coordinate(0, 0);
		Coordinate c2 = new Coordinate(4, 0);
		Coordinate c3 = new Coordinate(0, 5);

		Figure figure = FigureFactory.create(Lists.newArrayList(c1, c2, c3));

		Assertions.assertThat(figure).isEqualTo(new Triangle(Lists.newArrayList(c1, c2, c3)));
	}
}
