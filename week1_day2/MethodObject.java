package week1_day2;

public class MethodObject {
	
	public void browserName() {
		System.out.println("CHROME");

	}
	private void browserVersion(int version) {
		System.out.println("Version:"+ version);
	}
    void browserLogo(char logo) {
    	System.out.println("LOGO:"+logo);
	 
 }
    public int age(int a, int b) {
		return a+b;
    	
    }
    public String name(int age, String name) {
		return age +" "+ name;
    	
    }
    public static void main(String[] args) {
    	MethodObject lm= new MethodObject();
    	
    	lm.browserLogo('c');
    	lm.browserName();
    	lm.browserVersion(123);
    	
    	
    			
    //type 1
    int value = lm.age(10,10);
    System.out.println(value);
    
    //type2:
    System.out.println(lm.name(2024,  "TestLeaf"));
}
}
