import java.util.Arrays;
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
  public static boolean updateStationaries(String newStationaries , String oldStationaries){
	  boolean isUpdated = false ;
	  System.out.println("Before updating of stationaries");
	  for (int index = 0 ; index<stationaries.length; index++){
		  //if
		  if(stationaries[index] == oldStationaries){
			  //stationaries[0] = "Prker Pen"
			  stationaries[index] = newStationaries;
			  isUpdated = true;
			  System.out.println("Stationaries is added sucessfully");
			  
		  }
	  }
	  System.out.println("After updating of stationaries");
	       return isUpdated;
  }
    public static void deleteStationaries(String stationarie){
// looping the stationaries from array(stationaries)
    int newIndex , oldIndex;
	System.out.println("Stationaries Scale has to be deleted");
     for (newIndex=0 ,oldIndex=0; oldIndex< stationaries.length ; oldIndex++){
		 if(stationaries[oldIndex] != stationarie){
			 stationaries[newIndex++] = stationaries[oldIndex];
          
		 }
	 }
	 stationaries = Arrays.copyOf(stationaries , newIndex );
	 System.out.println("Stationaries scale is deleted sucessfully");
			 return ;
  }
  
  
  
}
