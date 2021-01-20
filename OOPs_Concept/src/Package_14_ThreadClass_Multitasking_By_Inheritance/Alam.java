package Package_14_ThreadClass_Multitasking_By_Inheritance;

import Package_03_Instance_variable.Alam_01;
import Package_15_multitaking_By_interface.alam;

class Alam extends Thread {
	 


		public void run() {
			
			for ( int a = 0; a< 10; a++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				System.out.println(" dada is good boy");
			}
		}
		class alam1 extends Thread {
	public void run() {
		
		for ( int a = 0; a< 10; a++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println(" alam is Lawyer");
		}
	}
	
		}

	public static void main(String[] args) {
		

		 Alam obj = new Alam();
         alam obj1 = new alam();
          obj.start();
          obj.start();
		
		 
	}

}
