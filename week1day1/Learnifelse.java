package week1day1;

public class Learnifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=5;
  if (num>6) {
	  System.out.println("Desired Value received");
  }
  else {
	  System.out.println("Lesser than desired value");
  }
	
  int age= 26;
  if (age >25) {
  
	  System.out.println("Working person");
  }
	  else if(age >19) {
		  System.out.println("Not Working person");
		  
	  }
	  else {
		  System.out.println("No Data Found");
	  }
  
  int mark=-1;
  if(mark>35) {
	  System.out.println("PASS");
	  
  }
  else if(mark>=35) {
	  System.out.println("Just PASS");
  }
  else if(mark<=0) {
	  System.out.println("ABSENT");
  }
  else {
	  System.out.println("FAIL");
  }
  }
}





