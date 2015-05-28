import java.util.HashMap;
import java.util.Map;


public class RomanNumeralConverter {

	private static Map<String, Integer> romanNumbersMap = new HashMap<String, Integer>();
	
	static {
		romanNumbersMap.put("I", 1);
		romanNumbersMap.put("V", 5);
		romanNumbersMap.put("X", 10);
		romanNumbersMap.put("L", 50);
	}
	
	public Integer convert(String romanNumeral) {
		String firstDigit = romanNumeral.substring(0, 1);
		String endDigits = romanNumeral.substring(1);
		
		if(romanNumeral.length() != 1) {
			String nextDigit = endDigits.substring(0, 1);
			int digitDifference = lookUpDigit(firstDigit) - lookUpDigit(nextDigit);
			if (digitDifference < 0) {
				return Math.abs(digitDifference);
			}
			return lookUpDigit(firstDigit) + convert(endDigits);
		} else {
			return lookUpDigit(firstDigit);
		}
	}
	
	private Integer lookUpDigit(String digit) {
		return romanNumbersMap.get(digit);
	}

}
