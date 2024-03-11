import java.util.Arrays;
class Resturant1{
	
      
	  static  String name = "7 season";
	  static String foodItems[] ={null,null,null,null,null,null,null};
	  static String ownerName = "Rahulla&team";
	  static String address = "Marathalli";
	  static int index ;
	  // method
	  public static boolean addFoodItems(String foodItem){
		  //"Akki Rotti" != null
		  System.out.println("inside addFoodItems():");
		  boolean isAdded = false;
		  if(foodItem !=null){
			  //code
			  //foodItems[0] = "Akki Rotti";
			  foodItems[index]= foodItem;
			    index++;
				isAdded = true;
				System.out.println("Food Item added Sucessfully...");
		  }else{
			  System.out.println("food Item can't be null");
		  }
		  System.out.println("end of addFoodItems()");
		  return isAdded;
	  }
           // for data
		   public static void getFoodItems(){
			   for(int index =0; index<foodItems.length; index++){
				   System.out.println(foodItems [index]);
			   }
		   }
  public static boolean updateFoodItem(String newFoodItem, String oldFoodItem){
	  boolean isUpdated = false ;
	  //System.out.println("Before updating the food value");
	  for(int pos =0 ; pos<foodItems.length; pos++){
		  
		  //if 
		  //"Akki Roti" = "Akki Roti"
		  if (foodItems[pos] == oldFoodItem){
			  
			  //foodItems[0] = "Lemon Chicken"
			  foodItems[pos] = newFoodItem;
			  isUpdated = true ;
			  //System.out.println("Food item value is added sucessfully");
		  }
	  }
	  System.out.println("After updating the food value");
 
		   	   		   return isUpdated;
  }
  //delete
  public static void deleteFoodItems(String foodItem){
// looping the food items from array(foodItems)
    int newIndex , oldIndex;
     for (newIndex=0 ,oldIndex=0; oldIndex< foodItems.length ; oldIndex++){
		 if(foodItems[oldIndex] != foodItem){
			 foodItems[newIndex++] = foodItems[oldIndex];
			
		 }
	 }
	 foodItems = Arrays.copyOf(foodItems , newIndex );
			 return ;
  }

}