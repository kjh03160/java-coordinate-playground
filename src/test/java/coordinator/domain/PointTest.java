package coordinator.domain;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import coordinator.domain.Point;

class PointTest {

	@Test
	void 점은_0_이상_최대_24_까지만_입력_가능하다() {
		Assertions.assertThatNoException().isThrownBy(() -> new Point(0));
		Assertions.assertThatNoException().isThrownBy(() -> new Point(24));

		Assertions.assertThatThrownBy(() -> new Point(25))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("24를 초과할 수 없습니다.");
		Assertions.assertThatThrownBy(() -> new Point(-1))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("0 미만이 될 수 없습니다.");

	}
}
