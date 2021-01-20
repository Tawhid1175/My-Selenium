package Package_02_function_parameter;

public class Alam {
	
      
       public int a = 20;
       public int b = 20;
       public int c = a +b;

    public void my() {
    	
      this.c =this.a+this.b;
    }
 
	public static void main(String[] args) {
		
		
		Alam obj = new Alam();
		
		obj.my();
		
	 System.out.println(obj.c);	

	}

}
