class ProtienBarTester{
      public static void main(String MAX[]){
		  
		  System.out.println("main has started");
		  String ingredients[] = {"Almonds"," High Oleic Sunflower Oil"," Whole Grain Rolled Oats"," Fructos","Cocoa Mass"};
		  
		  
	       ProtienBar protienBar  = new ProtienBar(ingredients , "Max","100g" , "solid" , 80 , true);
		   protienBar.displayInfo();
	  
	  
	     System.out.println("main has ended");
	  }
}