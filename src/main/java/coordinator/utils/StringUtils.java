package coordinator.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	private static final Pattern INPUT_PATTERN = Pattern.compile("\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)");
	private static final int NUMBER_COUNT = 4;

	public static int[] splitCoordinateString(String input) {
		Matcher matcher = INPUT_PATTERN.matcher(input);
		int[] result = new int[NUMBER_COUNT];
		if (!matcher.matches()) {
			throw new IllegalArgumentException("입력 형식에 맞지 않습니다");
		}
		for (int i = 0; i < NUMBER_COUNT; i++) {
			result[i] = Integer.parseInt(matcher.group(i + 1));
		}
		return result;
	}
}
