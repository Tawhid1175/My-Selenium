package Package_03_Instance_variable;

public class Alam_01 {
	
  public int a = 10;
  
  public int b = 20;
  
  public int c = a +b;
	
   public void my() {
	   
	   this.c =this.a +this.b;
	   System.out.println(this.c);
   }


	 
 public static void maid( String[] args) {
	 
	 Alam_01 obj = new  Alam_01();
	 obj.my();
 
	 


	 
 }
 
 
	 
	 
}
