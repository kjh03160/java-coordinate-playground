package coordinator;

import java.util.List;

import coordinator.domain.Calculator;
import coordinator.domain.Coordinate;
import coordinator.utils.StringUtils;
import coordinator.view.InputView;
import coordinator.view.ResultView;

public class Main {
	public static void main(String[] args) {
		List<Coordinate> coordinates = InputView.inputCoordinates();
		Coordinate coordinate1 = coordinates.get(0);
		Coordinate coordinate2 = coordinates.get(1);
		ResultView.printDistance(coordinate1.distanceFrom(coordinate2));
	}
}
