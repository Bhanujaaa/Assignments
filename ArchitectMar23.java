package test1;

public class ArchitectMar23 {
	boolean convert(String Input, String InputCheck) {
		String InputCm[] = Input.split(" ");
		String InputM[] = InputCheck.split(" ");
		if (InputCm.length > 2 || InputM.length > 2) {
			return false;
		}
		if ((Input.toLowerCase().equals(InputCheck.toLowerCase())) && Input.toLowerCase().equals("1 cm")) {
			return true;
		}
		if ((Input.toLowerCase().equals(InputCheck.toLowerCase())) && Input.toLowerCase().equals("1 g")) {
			return true;
		}

		if (InputCm[1].toLowerCase().equals("m") && InputM[1].toLowerCase().equals("cm")) {
			if (Integer.parseInt(InputCm[0]) * 100 == Integer.parseInt(InputM[0])) {
				return true;
			}
			return false;
		}
		if (InputCm[1].toLowerCase().equals("cm") && InputM[1].toLowerCase().equals("km")) {
			if (Float.parseFloat(InputCm[0]) / 100000 == Float.parseFloat(InputM[0])) {
				return true;
			}
			return false;
		}

		if (InputCm[1].toLowerCase().equals("kg") && InputM[1].toLowerCase().equals("g")) {
			if (Float.parseFloat(InputCm[0]) * 1000 == Float.parseFloat(InputM[0])) {
				return true;
			}
			return false;
		}
		return false;

	}

	boolean calculateWeight(String Input, String InputCheck) {
		String InputCompute[] = Input.split(" ");
		String InputResultExpected[] = InputCheck.split(" ");
		float resultWt = 0;
		if (InputCompute[1].toLowerCase().equals("g") && InputCompute[4].toLowerCase().equals("kg")) {
			if (InputCompute[2].equals("+")) {
				resultWt = Float.parseFloat(InputCompute[0]) + (Float.parseFloat(InputCompute[3]) * 1000);

			} else {
				resultWt = Float.parseFloat(InputCompute[0]) - (Float.parseFloat(InputCompute[3]) * 1000);
			}
		}
		if (InputCompute[1].toLowerCase().equals("kg") && InputCompute[4].toLowerCase().equals("g")) {
			if (InputCompute[2].equals("+")) {
				resultWt = Float.parseFloat(InputCompute[0]) + (Float.parseFloat(InputCompute[3])) / 1000;

			} else {
				resultWt = Float.parseFloat(InputCompute[0]) - (Float.parseFloat(InputCompute[3]) / 1000);
			}
		}
		if (resultWt == Float.parseFloat(InputResultExpected[0])) {
			return true;
		}
		return false;
	}

	boolean calculateLength(String Input, String InputCheck) {
		String InputCompute[] = Input.split(" ");
		String InputResultExpected[] = InputCheck.split(" ");
		float result = 0;

		if (InputCompute[1].toLowerCase().equals("m") && InputCompute[4].toLowerCase().equals("cm")) {

			if (InputCompute[2].equals("+")) {
				result = Float.parseFloat(InputCompute[0]) + (Float.parseFloat(InputCompute[3]) / 100);

			} else {
				result = Float.parseFloat(InputCompute[0]) - (Float.parseFloat(InputCompute[3]) / 100);
			}
		}
		if (InputCompute[1].toLowerCase().equals("cm") && InputCompute[4].toLowerCase().equals("km")) {
			if (InputCompute[2].equals("+")) {
				result = Float.parseFloat(InputCompute[0]) + (Float.parseFloat(InputCompute[3]) * 100000);

			} else {
				result = Float.parseFloat(InputCompute[0]) - (Float.parseFloat(InputCompute[3]) * 100000);
			}
		}
		if (InputCompute[1].toLowerCase().equals("cm") && InputCompute[4].toLowerCase().equals("m")) {
			if (InputCompute[2].equals("+")) {
				result = Float.parseFloat(InputCompute[0]) + (Float.parseFloat(InputCompute[3]) * 100);

			} else {
				result = Float.parseFloat(InputCompute[0]) - (Float.parseFloat(InputCompute[3]) * 100);
			}
		}

		if (result == Float.parseFloat(InputResultExpected[0])) {
			return true;
		}
		return false;
	}

	boolean tempConvert(String Input, String InputCheck) {
		String InputCompute[] = Input.split(" ");
		String InputResultExpected[] = InputCheck.split(" ");
		Double resultTemp;
		if (InputCompute[1].toLowerCase().equals("c") && InputResultExpected[1].toLowerCase().equals("f")) {
			resultTemp = (Double.parseDouble(InputCompute[0]) * (9 / 5)) + 32;
			if (resultTemp == Double.parseDouble(InputResultExpected[0])) {
				return true;
			}
		}
		if (InputCompute[1].toLowerCase().equals("k") && InputResultExpected[1].toLowerCase().equals("c")) {
			resultTemp = Double.parseDouble(InputCompute[0]) - 273;
			if (resultTemp == Double.parseDouble(InputResultExpected[0])) {
				return true;
			}
		}
		return false;
	}
}