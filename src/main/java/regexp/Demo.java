package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public String getRegExpString(String text) {
		String result = null;

		String regex = "(?<=\\s*+)\\S*";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		if (matcher.find()) {
			result = matcher.group();
		}

		return result;
	}

}
