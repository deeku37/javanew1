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

}