import java.util.HashMap;
import java.util.Map;


public class RomanNumeralConverter {

	private static Map<String, Integer> romanNumbersMap = new HashMap<String, Integer>();
	
	static {
		romanNumbersMap.put("I", 1);
		romanNumbersMap.put("V", 5);
		romanNumbersMap.put("X", 10);
		romanNumbersMap.put("L", 50);
		romanNumbersMap.put("C", 100);
		romanNumbersMap.put("D", 500);
		romanNumbersMap.put("M", 1000);
	}
	
	public Integer convert(String romanNumeral) {		
		return arabicNumeralBuilder(0, 0, romanNumeral);
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
