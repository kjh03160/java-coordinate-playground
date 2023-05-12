package coordinator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoordinateTest {
	@Test
	void 두_점의_좌표를_생성한다() {
		Coordinate coordinate = new Coordinate(1, 2);
		Assertions.assertThat(coordinate.getX()).isEqualTo(new Point(1));
		Assertions.assertThat(coordinate.getY()).isEqualTo(new Point(2));
	}
}
