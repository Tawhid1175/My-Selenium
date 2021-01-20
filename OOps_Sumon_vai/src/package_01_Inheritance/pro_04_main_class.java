package package_01_Inheritance;

public class pro_04_main_class {

	public static void main(String[] args) {
		
		 pro_02_son_class obj = new  pro_02_son_class();
			
			System.out.println(" this is come from son class");
			
			obj.rajib();
			obj.dada();
			obj.multiapplication();
			
			pro_03_third_class  obj1 = new pro_03_third_class ();
			
			System.out.println(" this is come from son multi class");
			
			obj1.rajib();
			obj1.dada();
			obj1.multiapplication();

	}

}
