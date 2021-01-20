package Package_06b_Inheritance_By_Sumon_vai;

 public class Pro_04_Hierarcchial_inheri_A {
	// sobai father class theke inh korbe
	
	 void  rajib () {
		 
		 System.out.println("Rajib is IT Eng");
	 }
 }

	class Pro_04_Hierarcchial_inheri_B extends Pro_04_Hierarcchial_inheri_A {
			
		 void  dada () {
			 
			 System.out.println("Dada is Banker");
		 }
	}	 
		 
		 class Pro_04_Hierarcchial_inheri_C extends Pro_04_Hierarcchial_inheri_A{
				
			 void  alam () {
				 
				 System.out.println("alam is lawyer");
			 }
		 
	     public  static void main(String[] args) {
	
		  Pro_04_Hierarcchial_inheri_C raj = new  Pro_04_Hierarcchial_inheri_C();
		  raj.alam();
		  raj.rajib();
	}

}
