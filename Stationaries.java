class Stationaries{
  static String name = "More";
  static String ownerName = "Latha";
  static String address ="MG Road";
  static String stationaries[] ={null,null,null,null,null,null,null,null,null,null};
  static int index;
  
 //method 
 public static boolean addStationaries(String stationarie){
	 //"Pen" !=null
	 System.out.println("inside addStationaries):");
	 boolean isAdded = false;
	 if(stationaries !=null){
		 //code
		 //stationaries[0] ="Pen";
		 stationaries[index] = stationarie;
		 index++;
		 isAdded = true;
		 System.out.println("stationaries is added succesfully....");
		 
	 }
	 else{
		 System.out.println("stationaries cannot  be null");
		  }
		  System.out.println("End of addstationaries ()");
		  return isAdded;
		  
 }
  //for data type
  
  public static void getStationaries(){
	  for(int index=0; index<stationaries.length; index++){
	  System.out.println(stationaries [index]);
	  
  }
  }
}