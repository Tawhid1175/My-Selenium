package Package_10_Interface;


interface first {
	
	void firstmethod();
}

public class Alam implements first{
	
	public void new1() {
		
		System.out.println(" first method");
	}

	@Override
	public void firstmethod() {
		// TODO Auto-generated method stub
		
	}

 public static void main ( String[] args) {
	 
    Alam obj = new Alam()	; 
	 
	 obj.new1();
 }
}
