import java.util.Arrays;
class MobileAccessories{
   // public static void main([])
	static String name = "SmartPhone";
	static String accessories[] = {null,null,null,null,null,null,null,null,null,null};
	static String modelName ="iphone";
	static String modelSeriesName = "15pro";
	static  int index;
	//method
	public static boolean addAccessories(String accessorie){
		//"Data Cable" !=null
		System.out.println("inside addAccessories():");
		boolean isAdded = false;
		if(accessories !=null){
			///code
			//accories[0] = "Data Cable";
			accessories[index]= accessorie;
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
	
       // FOR DATA TYPE
	   public static void getAccessories(){
		   for (int index=0; index<accessories.length; index++){
			   System.out.println(accessories [index]);
		   }
	   }
     public static boolean updateAccessories(String newAccessories, String oldAccessories){
		    boolean isUpdated = false;
			System.out.println("Before updating the MobileAccessories"); 
			 for(int index =0; index<accessories.length; index++){
				 if(accessories[index] == oldAccessories){
					  //accessories[0] = "Memory Card"
					  accessories [index] = newAccessories;
                      isUpdated = true ;
               System.out.println("MobileAccessories is added sucessfully");
			   
				 }
			 }
			 System.out.println("After updating the MobileAccessories");
			        return isUpdated;
	 }
    public static void deleteAccessories(String accessorie){
// looping the stationaries from array(stationaries)
    int newIndex , oldIndex;
	System.out.println("Acessories Lcds-Display has to be deleted");
     for (newIndex=0 ,oldIndex=0; oldIndex< accessories.length ; oldIndex++){
		 if(accessories[oldIndex] != accessorie){
			 accessories[newIndex++] = accessories[oldIndex];
          
		 }
	 }
	 accessories = Arrays.copyOf(accessories , newIndex );
	 System.out.println("Accessories Lcds-Display is deleted sucessfully");
			 return ;
  }
  
  
}


