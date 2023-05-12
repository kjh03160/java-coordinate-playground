package coordinator;

import coordinator.utils.StringUtils;
import coordinator.view.InputView;

public class Main {
	public static void main(String[] args) {
		Coordinate coordinate1, coordinate2;
		while (true) {
			String input = InputView.input();
			int[] points = StringUtils.splitCoordinateString(input);
			try {
				coordinate1 = new Coordinate(points[0], points[1]);
				coordinate2 = new Coordinate(points[2], points[3]);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
