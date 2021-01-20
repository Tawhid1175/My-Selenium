package Package_15_multitaking_By_interface;

public class Program_02_class implements Runnable  {


public void run() {
		
		
		for (int i =0; i < 10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Dada is good boy");
		}
	}

}
