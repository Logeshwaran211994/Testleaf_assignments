package week1_day2;

import java.util.Arrays;

public class PrintDuplicateValues {

	public static void main(String[] args) {
	int value[]= {78,98,89,78,23,100,98,100};
	//Nested For loop
	for (int i = 0; i < value.length; i++) {
		for (int j = i+1; j < value.length; j++) {
			if(value[i]==value[j]) {
				System.out.println("Print duplicate values:"+value[j]);
			}
			
		}
		
		
	}
	int age[]= {30,45,23,89,13,12,30,23,89};
	Arrays.sort(age);
	for (int i = 0; i < age.length-1; i++) {
		if (age[i]==age[i+1]) 
		{
			System.out.println("print duplicate values using single for loop"+age[i+1]);
			
		}
		
	}
		

	}

}
