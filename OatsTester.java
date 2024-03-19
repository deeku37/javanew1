class OatsTester{
      public static void main(String Quaker[]){
		  
		  System.out.println("main has started");
		  String ingredients[] = {"WHOLE GRAIN ROLLED OATS "","Milk","Honey");
		  
		  
	       Oats oats  = new Oats(ingredients , "Quaker","250g" , "Powder" , 180 , true);
		   oats.displayInfo();
	  
	  
	     System.out.println("main has ended");
	  }
}