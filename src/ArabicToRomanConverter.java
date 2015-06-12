
public class ArabicToRomanConverter {

	public String convert(int input) {
		String result = "";

		int onesPlace = input % 5;
		int fivesPlace = input % 10;
		int tensPlace = input % 50 / 10;
		
		if (input == 9) {
			return "IX";
		}
		
		if (tensPlace < 4) {
			while (tensPlace > 0) {
				result += "X";
				tensPlace--;
			}
		}
		
		if (fivesPlace >= 4) {
			result = "V";
		}
		
		if (onesPlace < 4) {
			while (onesPlace > 0) {
				result += "I";
				onesPlace--;
			}
		} else if (onesPlace == 4) {
			result = "I"+result;
		}
		
		return result;
	}

}
