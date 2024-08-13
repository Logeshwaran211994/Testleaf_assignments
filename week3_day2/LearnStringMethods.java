package week3_day2;

public class LearnStringMethods {

	public static void main(String[] args) {
		String name="Test Leaf";
		String[] split = name.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		System.out.println();
	
			String replaceAll = name.replaceAll("[ ]","");
			System.out.println(replaceAll);
		
			String value="LOGESHWARAN";
			String replace = value.replace('A','Z');
			System.out.println(replace);
			
			String nom="Selenium webdriver";
			String substring = nom.substring(9);
			System.out.println(substring);
			
			String substring2 = nom.substring(7,15);
			System.out.println(substring2);
			
			String comname="Test Leaf";
			String lowerCase = comname.toLowerCase();
			System.out.println(lowerCase);
			String upperCase = comname.toUpperCase();
			System.out.println(upperCase);
			
			String price="2000";
			int int1 = Integer.parseInt(price);
			System.out.println(int1);
	}

}
