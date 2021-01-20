package Package_15_multitaking_By_interface;

public class Program_01_Class implements Runnable {
	
	// multitasking method er nam sob somoy run dite hobe 
	// na hoy program execute korbe na 
	
	
public void run() {
		
		
		for (int i =0; i < 10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Tawhid is good boy");
		}
	}

}
