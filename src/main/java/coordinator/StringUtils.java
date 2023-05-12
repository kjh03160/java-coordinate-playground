package coordinator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {
	private static final String POINT_DELIMITER = ",";
	public static List<Integer> splitPointString(String input) {
		String[] split = input.split(POINT_DELIMITER);
		return Arrays.stream(split)
			.map(Integer::parseInt)
			.collect(Collectors.toList());
	}
}
