package Package_12_Access_modifiers;

public class Mod_01 {
	
	
   public class A {
	   
	   // 1) private access  modifier
	   
	   // amra jodi kono method ba variabe smne private keyWord ta use kori
	   // tokkhn shudu oi method ta variable oi class e kaj korbe
	   
	  //onno kono class take call kora jabe na
	   
      // 2) public  excess modifire 
	   
	   // amara sob khane use korte parbo
	    
        
	 // 3) default  access  modifier
	   
	  // r jodi amra  kono access modifire na likhi public / private. 
	   //  tokhn setake amra default  access  modifier hisabe dhore nite pari
	   // tokhn seta ke amra oi package  er sob class e bebohar korte parbo
	   
	   //public excess modifier sob jaigai use kora jabe
	   
	   //4) protective  access modifire 
	   
	   //protective  access modifire k package sob sob class e use korte parbo u
	   
	   
       // kintu amra cai inheritance bebohar kore onno package e use korte pari

	   // 4) public  excess modifire 
	   
	   // amara sob khane use korte parbo
	   
	   
	   public String  s = "Hello";
	   void A_method() {
		   
		   
		   System.out.println(s);
	   }
   }

   
   public class B{
	   
	   
	   void B_method() {
		   
		   A obj = new A();
		   
		   System.out.println(obj.s);
	   }
   }
   
   
   public class C{
	   
	   void C_method() {
		   
		   A obj = new A();
		   
		   System.out.println(obj.s);
	   }
   }
}

   
	 
	 
 
    
