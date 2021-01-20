package Package_15_multitaking_By_interface;

import Package_14_ThreadClass_Multitasking_By_Inheritance.Class_01;
import Package_14_ThreadClass_Multitasking_By_Inheritance.Class_02;

public class Program_04_main_class {

	public static void main(String[] args) {
		
		
		Program_01_Class objA = new Program_01_Class();
		Program_02_class objB = new Program_02_class();
		
		Thread x = new Thread(objA);
            x.start();

   Thread y = new Thread(objB);
     y.start();
	}

}
