package br.com.erudio.converters;

public class NumberConverter {

	public static Double convertToDouble(String strNumber) {
		if (strNumber == null) return 0D;
		/* No Brasil a casa decinal é separada por virgula "," e como toda a linguagem de programação
		 * é baseada nos EUA a separação decimal é feita pelo ponto "." então todas as  linguagem  de
		 * programação somente aceitam o ponto "." como separador decimal, nosso código vai tratar  o
		 * separador, aceitando tanto a virgula quanto o ponto.
		 */
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}

	public static boolean isNumeric(String strNumber) {
		if (strNumber == null) return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
