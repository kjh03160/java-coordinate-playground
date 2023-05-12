package coordinator;

import coordinator.utils.StringUtils;
import coordinator.view.InputView;

public class Main {
	public static void main(String[] args) {
		String input = InputView.input();
		int[] points = StringUtils.splitCoordinateString(input);

	}
}
