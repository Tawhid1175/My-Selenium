package Package_14a_practic;

import Package_01_first_Program_Object_Variable.Alam;

public class alam2_main {

	public static void main(String[] args) {
		
		// multitasking by inheritance
		
	 alam obj = new alam();
		 
	 alam1 obj1 = new alam1();


      Thread x = new Thread(obj);
     x.start();
     
     
     Thread y = new Thread(obj1);
     y.start();
     
	}

}
