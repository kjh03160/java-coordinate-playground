package coordinator.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import coordinator.domain.Coordinate;
import coordinator.domain.Figure;
import coordinator.domain.FigureFactory;

public class InputView {
	private static final String INPUT_COORDINATE = "좌표를 입력하세요.";
	private static final String ERROR_INVALID_COORDINATES = "올바르지 않은 입력값입니다.";
	private static final String ERROR_DUPLICATE_POINTS = "중복된 좌표가 존재합니다.";
	private static final String POINT_DELIMITER = "-";
	private static final Pattern INPUT_PATTERN = Pattern.compile("(\\([0-9]{1,2},[0-9]{1,2}\\))(-(\\([0-9]{1,2},[0-9]{1,2}\\))){0,3}");
	private static final Pattern COORDINATE_PATTERN = Pattern.compile("\\(([0-9]{1,2}),([0-9]{1,2})\\)");
	private static Scanner scanner = new Scanner(System.in);

	public static List<Coordinate> inputCoordinates() {
		System.out.println(INPUT_COORDINATE);
		return inputCoordinates(scanner.nextLine());
	}

	public static Figure inputFigure() {
		System.out.println(INPUT_COORDINATE);
		List<Coordinate> coordinates = inputCoordinates(scanner.nextLine());
		return FigureFactory.create(coordinates);
	}

	public static List<Coordinate> inputCoordinates(String input) {
		try {
			input = input.replace(" ", "");
			checkAccuracyOfPoints(input);
			return generateCoordinates(input);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return inputCoordinates();
		}
	}

	private static void checkAccuracyOfPoints(String input) {
		Matcher matcher = INPUT_PATTERN.matcher(input);
		if (!matcher.matches()) {
			throw new IllegalArgumentException(ERROR_INVALID_COORDINATES);
		}
	}

	private static List<Coordinate> generateCoordinates(String input) {
		String[] inputPoints = input.split(POINT_DELIMITER);

		List<Coordinate> coordinates = new ArrayList<>();
		for (String inputPoint : inputPoints) {
			coordinates.add(generateCoordinate(inputPoint));
		}
		checkDuplicationOf(coordinates);
		return coordinates;
	}

	private static Coordinate generateCoordinate(String inputPoint) {
		Matcher matcher = COORDINATE_PATTERN.matcher(inputPoint);
		if (matcher.find()) {
			int x = Integer.parseInt(matcher.group(1));
			int y = Integer.parseInt(matcher.group(2));
			return new Coordinate(x, y);
		}
		throw new IllegalArgumentException(ERROR_INVALID_COORDINATES);
	}

	private static void checkDuplicationOf(List<Coordinate> points) {
		if (points.size() != new HashSet<>(points).size()) {
			throw new IllegalArgumentException(ERROR_DUPLICATE_POINTS);
		}
	}
}
