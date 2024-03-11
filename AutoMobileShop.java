import java.util.Arrays;
class AutoMobileShop{
	static String name = "bike";
	static String accessories[] = {null,null,null,null,null,null,null,null,null,null};
	static String modelName ="benli";
	static  int index;
	
	
	//method
	public static boolean addAccessories(String accessory){
		
		System.out.println("inside addAccessories():");
		boolean isAdded = false;
		if(accessories !=null){
			accessories[index]=accessory;
			index++;
			isAdded = true;
			System.out.println("Accessories is added sucessfully......");	
		}
		else{
			System.out.println("Accesories can't be null");
		}
		System.out.println("End of addAccessories ()");
		return isAdded;
		
	}
	
       //get data
	   public static void getAccessories(){
		   for (int index=0; index<accessories.length; index++){
			   System.out.println(accessories [index]);
		   }
	   }
	   
	   public static boolean updateAccessories(String newAccessories, String oldAccessories){
	  System.out.println("update Accessories");
	  boolean isUpdated = false ;
	  
	  for(int index=0 ; index<accessories.length ; index++){
		  
		  if(accessories[index]==oldAccessories){
			  accessories[index] = newAccessories;
			  isUpdated = true;
		  }
		  
	  }
	  System.out.println("accessories updates successfully");
		  return isUpdated;
      }
	   public static void deleteAccessories(String accessorie){
// looping the accessoriesfrom array(accessories)
    int newIndex , oldIndex;
	System.out.println("Acessories seat cover has to be deleted");
     for (newIndex=0 ,oldIndex=0; oldIndex< accessories.length ; oldIndex++){
		 if(accessories[oldIndex] != accessorie){
			 accessories[newIndex++] = accessories[oldIndex];
          
		 }
	 }
	 accessories = Arrays.copyOf(accessories , newIndex );
	 System.out.println("Accessories seat cover is deleted sucessfully");
			 return ;
  }
  
   


}
