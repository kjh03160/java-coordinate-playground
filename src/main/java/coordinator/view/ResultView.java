package coordinator.view;

import coordinator.domain.Figure;

public class ResultView {
	private static final String LINE_RESULT_MESSAGE = "두 점 사이 거리는 %f\n";
	private static final String FIGURE_RESULT_MESSAGE = "%s의 넓이는 %.0f\n";

	public static void printDistance(double distance) {
		System.out.printf(LINE_RESULT_MESSAGE, distance);
	}

	public static void printFigureArea(Figure figure) {
		System.out.printf(FIGURE_RESULT_MESSAGE, figure.name(), figure.area());
	}
}
