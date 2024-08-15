package week4_day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		int[] num = {23,45,89,79,45,23,90,12};
		
		Set <Integer> value=new HashSet<Integer>();
		//Set <Integer> value=new LinkedHashSet<Integer>();
		//Set <Integer> value=new TreeSet<Integer>();
		
		for (Integer i : num) {
			value.add(i);
			
		}
			System.out.println(value);
			
			//print index of 4:
			
			List<Integer> val=new ArrayList<Integer>(value);
				Integer data = val.get(4);
				System.out.println(data);
		}

	}


