package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		String value = "MADAM";
		String valueRev = "";
		for (int i = value.length()-1; i >= 0; i--) {

			valueRev = valueRev + value.charAt(i);

		}
		if (valueRev.equalsIgnoreCase(value)) {
			System.out.println(value + " is Palindrome");
		} else {
			System.out.println(value + " is not Palindrome");
		}

	}
}
