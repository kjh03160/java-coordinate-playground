package coordinator.domain;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import coordinator.domain.Coordinate;
import coordinator.domain.Rectangle;

class RectangleTest {

	@Test
	void 사각형을_생성한다() {
		Coordinate c1 = new Coordinate(0, 0);
		Coordinate c2 = new Coordinate(4, 0);
		Coordinate c3 = new Coordinate(0, 5);
		Coordinate c4 = new Coordinate(4, 5);

		Rectangle rectangle = new Rectangle(Lists.newArrayList(c4, c2, c3, c1));

		Assertions.assertThat(rectangle.getLeftDownCoordinate()).isEqualTo(c1);
		Assertions.assertThat(rectangle.getRightDownCoordinate()).isEqualTo(c2);
		Assertions.assertThat(rectangle.getLeftUpCoordinate()).isEqualTo(c3);
		Assertions.assertThat(rectangle.getRightUpCoordinate()).isEqualTo(c4);
	}

	@Test
	void 좌표가_4개가_아닐경우_사각형을_생성할_수_없다() {
		Coordinate c1 = new Coordinate(0, 0);
		Coordinate c2 = new Coordinate(4, 0);
		Coordinate c3 = new Coordinate(0, 5);

		Assertions.assertThatThrownBy(() -> new Rectangle(Lists.newArrayList(c1, c2, c3)))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("4개의 좌표가 필요합니다.");
	}

	@Test
	void 직사각형의_좌표가_아닌_경우_사각형을_생성할_수_없다() {
		Coordinate c1 = new Coordinate(0, 0);
		Coordinate c2 = new Coordinate(4, 0);
		Coordinate c3 = new Coordinate(0, 5);
		Coordinate c4 = new Coordinate(4, 6);

		Assertions.assertThatThrownBy(() -> new Rectangle(Lists.newArrayList(c1, c2, c3, c4)))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("직사각형이 아닙니다.");
	}

	@Test
	void 사각형의_면적을_구한다() {
		Coordinate c1 = new Coordinate(0, 0);
		Coordinate c2 = new Coordinate(4, 0);
		Coordinate c3 = new Coordinate(0, 5);
		Coordinate c4 = new Coordinate(4, 5);

		Rectangle rectangle = new Rectangle(Lists.newArrayList(c4, c2, c3, c1));

		Assertions.assertThat(rectangle.area()).isEqualTo(20);
	}
}
