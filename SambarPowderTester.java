class SambarPowderTester{
      public static void main(String MTR[]){
		  
		  System.out.println("main has started");
		  String ingredients[] = {"Red Chilly","Coriander","Cumin","Fenugreek","Cassia"};
		  
		  
	       SambarPowder sambarPowder  = new SambarPowder(ingredients , "MTR","100g" , "Powder" , 80 , true);
		   sambarPowder.displayInfo();
	  
	  
	     System.out.println("main has ended");
	  }
}