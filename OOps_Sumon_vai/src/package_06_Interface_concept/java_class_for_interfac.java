package package_06_Interface_concept;

public class java_class_for_interfac  implements interFace_class_01{
	

	// interface holo ekta emty  class
	
	// sei class er vitor method thake but kono body part  thake na par , ekhne 
	
	// new_interface_class obj1 = new new_interface_class();
	 

	

	@Override
	public void alam() {
		
		System.out.println("alam is good boy");
	}

	@Override
	public void rajib() {
		System.out.println(" rajib is IT Eng");
		
	}

	@Override
	public void dada() {
		System.out.println(" Dada get IT job");
		
	}

	@Override
	public void dada1() {
		System.out.println(" dada is senior cetizen");
		
	}
	
public static void main(String[] args) {
	java_class_for_interfac obj = new java_class_for_interfac();
	obj.alam();
	obj.rajib();
	obj.dada();
	obj.dada1();

	}


}
