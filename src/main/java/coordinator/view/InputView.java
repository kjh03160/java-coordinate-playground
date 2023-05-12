package coordinator.view;

import java.util.Scanner;

public class InputView {
	private static final String INPUT_COORDINATE_MESSAGE = "좌표를 입력하세요.";

	public static String input() {
		printInputMessage();
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
	private static void printInputMessage() {
		System.out.println(INPUT_COORDINATE_MESSAGE);
	}
}
