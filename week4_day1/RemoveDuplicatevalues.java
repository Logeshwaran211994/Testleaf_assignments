package week4_day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatevalues {

	public static void main(String[] args) {
		String name= "Selenium";
		char[] ch = name.toCharArray();
		
	Set<Character> uniq=new LinkedHashSet <Character>();
	for (Character character : ch) {
		uniq.add(character);
			}
	System.out.println(uniq);
	
	for (Character s : uniq) {
		String empty="";
		empty+=s;
		System.out.print(empty);
		
		
	}
	}

}
