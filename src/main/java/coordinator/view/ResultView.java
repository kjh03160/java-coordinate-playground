package coordinator.view;

public class ResultView {
	private static final String RESULT_MESSAGE = "두 점 사이 거리는 %f\n";

	public static void printDistance(double distance) {
		System.out.printf(RESULT_MESSAGE, distance);
	}
}
