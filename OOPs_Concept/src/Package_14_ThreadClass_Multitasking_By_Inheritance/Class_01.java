package Package_14_ThreadClass_Multitasking_By_Inheritance;

public class Class_01 extends Thread {
	
	// Multitasking By inheritance
	//  ekhn  nijer  motho method use kora jai na, run method use korte hoy;
	
	public void run() {
		
		
		for (int i =0; i < 10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("alam");
		}
	}
	

}
