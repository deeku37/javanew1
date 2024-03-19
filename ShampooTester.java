class ShampooTester{
      public static void main(String L'Oreal Paris[]){
		  
		  System.out.println("main has started");
		  String ingredients[] = {"Water","Sodium chloride","Sodium benzoate","Dimethicone","Cocamidopropyl betaine"};
		  
		  
	       Shampoo shampoo  = new Shampoo(ingredients , "L'Oreal Paris" , "1000 ml" , 800 , true);
		   shampoo.displayInfo();
	  
	  
	     System.out.println("main has ended");
	  }
}