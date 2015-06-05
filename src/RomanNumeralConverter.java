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
		
//		String firstDigit = romanNumeral.substring(0, 1);
//		String endDigits = romanNumeral.substring(1);
		
		
		
		return arabicNumeralBuilder(0, 0, romanNumeral);
//		
//		if(romanNumeral.length() == 1)
//			return lookUpDigit(firstDigit);
//		
//		String nextDigit = endDigits.substring(0, 1);
//		int digitDifference = lookUpDigit(firstDigit) - lookUpDigit(nextDigit);
//		if (digitDifference < 0) {
//			if (endDigits.length() > 1) {
//			return Math.abs(digitDifference)
//					+ convert(endDigits.substring(1));
//			} else {
//				return Math.abs(digitDifference);
//			}
//		}
//		return lookUpDigit(firstDigit) + convert(endDigits);
	}
	
	private Integer arabicNumeralBuilder(int previousDigitValue, int totalDigitValue, String romanNumeral) {
		if(romanNumeral.length() == 0)
			return totalDigitValue;
					
		String digit = romanNumeral.substring(romanNumeral.length()-1);
		String endDigits = romanNumeral.substring(0, romanNumeral.length()-1);
		int digitValue = lookUpDigit(digit);

		if (lookUpDigit(digit) < previousDigitValue) {
			return arabicNumeralBuilder(digitValue, totalDigitValue-digitValue, endDigits);
		} else {			
			return arabicNumeralBuilder(digitValue, totalDigitValue+digitValue, endDigits);
		}
		
	}

	private Integer lookUpDigit(String digit) {
		return romanNumbersMap.get(digit);
	}

}
