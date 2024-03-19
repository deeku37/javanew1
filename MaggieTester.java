class MaggiTester{
      public static void main(String nestle[]){
		  
		  System.out.println("main has started");
		  String ingredients[] = {"Salt","Onion","Water","Dimethicone","Chili powder"};
		  
		  
	       Maggi maggi  = new Maggi(ingredients , "nestle" , "100 gm" , 20, false);
		   maggi.displayInfo();
	  
	  
	     System.out.println("main has ended");
	  }
}