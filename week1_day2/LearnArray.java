package week1_day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		int[] data= {23,45,67,89,76,33};
		int length=data.length;
		System.out.println("Print Length of the Data:"+length);
		//Print last value of array
		System.out.println("Print last value of Array:"+data[length-1]);
		//Print largest number in Array
		Arrays.sort(data);
		//23,33,45,67,76,89
		System.out.println("Print largest number of Array:"+data[length-1]);
		System.out.println("Print anyone value of Aray:"+data[3]);
		//Ascending order print values
		for (int i = 0; i < length; i++) {
			System.out.println("Print values of arrray ascending:"+data[i]);
		}
			//Descending order print values
			for (int i = length-1; i >= 0; i--) {
				System.out.println("Print values of arrray Descending:"+data[i]);
	
			}
		}

	}


