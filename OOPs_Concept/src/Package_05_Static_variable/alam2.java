package Package_05_Static_variable;

public class alam2 {
	
     public static int a = 10;
     
     public static int b = 30;
     
        int c ;
        
        public void raj() {
        	

        this.c= this.a + this.b;
        	System.out.println(this.c);
        }
 	
	
	

	public static void main(String[] args) {
		
		 alam2  obj =  new  alam2();
		 
		obj.raj();

	}

}
