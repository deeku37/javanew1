class SoapTester{
      public static void main(String parkAvenue[]){
		  
		  System.out.println("main has started");
		  String ingredients[] = {"Extracts Of Shea Butter"," Peppermint Leaves","Orange","Rosemary ","Cedarwood"};
		  
		  
	       Soap soap  = new Soap(ingredients , "Park Avenue" , "100 gm" , 50 , true);
		   soap.displayInfo();
	  
	  
	     System.out.println("main has ended");
	  }
}