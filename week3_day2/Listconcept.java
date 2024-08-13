package week3_day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listconcept {

	public static void main(String[] args) {
		List<String> mentors=new ArrayList <String> ();
		mentors.add("Logeshwaran");
		mentors.add("Rinu");
		mentors.add("Abin");
		mentors.add("Amal");
		System.out.println(mentors);
		
		mentors.add(2, "Shubav");
		System.out.println(mentors);
		
		int size = mentors.size();
		System.out.println(size);
		
		boolean contains= mentors.contains("Rinu");
		System.out.println(contains);
	    
		mentors.remove(4);
		System.out.println(mentors);
		
		String string = mentors.get(3);
		System.out.println(string);
		for (int i = 0; i < mentors.size(); i++) {
			System.out.println(mentors.get(i));
		}
			
			Collections.sort(mentors);
			System.out.println(mentors);
			
			mentors.clear();
			System.out.println(mentors);
			
			int[] age= {2,4,3,9,7};
			List<Integer> value=new ArrayList<Integer>();
			for (int i = 0; i < age.length; i++) {
				value.add(age[i]);
				}
			System.out.println(value);
			String[] name= {"Logeshwaran","Abin"};
			List<String> value2=new ArrayList<String>();
			for (int i = 0; i < name.length; i++) {
				value2.add(name[i]);
			}
				System.out.println(value2);
			}
		
	}


