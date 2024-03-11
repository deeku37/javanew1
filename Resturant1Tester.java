class Resturant1Tester{
    public static void main(String foodItems[]){
	    Resturant1.addFoodItems("Akki Roti");
        Resturant1.addFoodItems("Rotti");
	    Resturant1.addFoodItems("Chiken Lollypop");
	    Resturant1.addFoodItems("Chicken Tikka");
	    Resturant1.addFoodItems("Chicken Briyani");
	     Resturant1.addFoodItems("kabab");
	    Resturant1.addFoodItems("south Thalli");
         Resturant1.getFoodItems();
  boolean  isFoodItemAdded= Resturant1.updateFoodItem("Lemon Chicken" , "kabab" );
	  Resturant1.getFoodItems();
     Resturant1.deleteFoodItems("south Thalli");
	   Resturant1.getFoodItems();

		}
      

}