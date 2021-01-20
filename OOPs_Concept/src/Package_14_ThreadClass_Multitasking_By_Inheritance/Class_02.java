package Package_14_ThreadClass_Multitasking_By_Inheritance;

public class Class_02 extends Thread {
	
public void run() {
		
		
		for (int i =0; i < 10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Tawhid");
		}
	}

}
