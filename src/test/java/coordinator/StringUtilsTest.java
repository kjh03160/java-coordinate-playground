package coordinator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import coordinator.utils.StringUtils;

class StringUtilsTest {

	@Test
	void 좌표를_구분한다() {
		Assertions.assertThat(StringUtils.splitCoordinateString("(10,1)-(1,1)"))
			.contains("10", "1", "1", "1");
		Assertions.assertThatThrownBy(()->StringUtils.splitCoordinateString("10,1)-(1,1)"))
			.isInstanceOf(IllegalArgumentException.class)
			.hasMessage("입력 형식에 맞지 않습니다");
	}
}
