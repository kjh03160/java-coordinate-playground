package coordinator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@Test
	void 숫자를_쉼표를_기준으로_구분한다() {
		Assertions.assertThat(StringUtils.splitPointString("3,4")).containsExactly(3, 4);
		Assertions.assertThatThrownBy(() -> StringUtils.splitPointString("d,4"))
			.isInstanceOf(NumberFormatException.class);
	}
}
