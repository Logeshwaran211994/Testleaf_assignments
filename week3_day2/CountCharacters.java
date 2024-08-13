package week3_day2;

public class CountCharacters {

	public static void main(String[] args) {
		String name="Selenium Webdriver";
		int count =0;
		int countR=0;
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
		if(ch[i]=='e') {
			count++;
			
		}
		else if(ch[i]=='r') {
			countR++;
		}
		}
	System.out.println("count of character e:"+count);
	System.out.println("count of character R:"+countR);
}
}
		
			
		
		
	


