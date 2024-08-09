package week3_day1;

public class ReverseString {

	public static void main(String[] args) {
		String value=("Logeshwaran");
		char[] charArray = value.toCharArray();
		for (int i = charArray.length-1; i >=0; i--) {
			System.out.println(charArray[i]);
			
		}
		}

	}


