package week3_day1;


public class LearnString {

	public static void main(String[] args) {
		String cname="TestLeaf";
		String name="Testleaf@2024";
		String Comname= new String ("TestLeaf");
		
		int length = name.length();
		System.out.println("Length of the string:" +length);
		
		char charAt = name.charAt(8);
		System.out.println("Value of index 8 is:" +charAt);
		
		boolean contains = cname.contains("Lea");
			System.out.println("The value is available:" +contains);	
			
		if (cname.equals(Comname)) {
			System.out.println("Equals");
		}
		else {
			System.out.println("not Equals");
		}
		
		String V="testleaf";
		
		if (cname.equalsIgnoreCase(V)){
		
		System.out.println("Equals");
	} else {
	
		System.out.println("not Equals");
		
	}
		String data ="TestLeaf";
		if(cname==data) {
		
		
			System.out.println("Memory allocated correctly");
		}
			else {
			System.out.println("Memory allocated incorrectly");
		}
		
		if(cname==Comname) {
		
		
			System.out.println("Memory allocated correctly");
		}
			else {
			System.out.println("Memory allocated incorrectly");
		}
	
	String array="LOGESHWARAN";
	char[] ch = array.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		System.out.println(ch[i]);
	}
	}

}
