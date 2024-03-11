class Swiggy{
     public static double search(String foodItems){
	 
	 if(foodItems == "Pizza"){
	   return 99.00;
	 }
	 if (foodItems == "CupCakes"){
	   return 100.00;
	 }
	 if (foodItems == "Browine"){
	   return 80.00;
	 }
	 if (foodItems == "French Fries"){
	  return 50.00;
	 }
	 if (foodItems == "Noodles"){
	  return 55.00;
	 }
	 	 if (foodItems == "SandWich"){
	  return 80.00;
	 }
	 	 if (foodItems == "Gobi Manchuri"){
	  return 85.00;
	 }
	 	 if (foodItems == "TwistTater"){
	  return 90.00;
	 }
	 	 if (foodItems == "Kulfi"){
	  return 30.00;
	 }
	 	 if (foodItems == "MilkShake"){
	  return 90.00;
	 }
	 	 if (foodItems == "Veg Burger Comb"){
	  return 100.00;
	 }
	 	 if (foodItems == "Chicken Burger Comb"){
	  return 150.00;
	 }
	 	 if (foodItems == "Muffins"){
	  return 55.00;
	 }
	 	 if (foodItems == "Spaghetti"){
	  return 90.00;
	 }
	 	 if (foodItems == "Bread Jam"){
	  return 55.00;
	 }
	 	 if (foodItems == "Shawarma"){
	  return 80.00;
	 }
	 	 if (foodItems == "Chicken Shawarma"){
	  return 120.00;
	 }
	 	 if (foodItems == "Nuggets"){
	  return 60.00;
	 }
	 	 if (foodItems == "Corn Shots"){
	  return 60.00;
	 }
	 	 if (foodItems == "Crispy Corn"){
	  return 75.00;
	 }
	 	 if (foodItems == "Paneer Manchuri"){
	  return 100.00;
	 }
	 	 if (foodItems == "Cheese Maggie"){
	  return 55.00;
	 }
	 	 if (foodItems == "Cheese Tost"){
	  return 85.00;
	 }
	 	 if (foodItems == "Chco Lava Cake"){
	  return 95.00;
	 }
	 	 if (foodItems == "Red Velvet Cake"){
	  return 95.00;
	 }
	 	 if (foodItems == "Pan Cake"){
	  return 55.00;
	 }
	  return 0.0;
	 }
	 
	 public static double search(String foodItems, int quantity){
	 
	 if(foodItems == "Pizza"){
	   return 99.00*quantity;
	 }
	 if (foodItems == "CupCakes"){
	   return 100.00*quantity;
	 }
	 if (foodItems == "Browine"){
	   return 80.00*quantity;
	 }
	 if (foodItems == "French Fries"){
	  return 50.00*quantity;
	 }
	 if (foodItems == "Noodles"){
	  return 55.00*quantity;
	 }
	 	 if (foodItems == "SandWich"){
	  return 80.00*quantity;
	 }
	 	 if (foodItems == "Gobi Manchuri"){
	  return 85.00*quantity;
	 }
	 	 if (foodItems == "TwistTater"){
	  return 90.00*quantity;
	 }
	 	 if (foodItems == "Kulfi"){
	  return 30.00*quantity;
	 }
	 	 if (foodItems == "MilkShake"){
	  return 90.00*quantity;
	 }
	 	 if (foodItems == "Veg Burger Comb"){
	  return 100.00*quantity;
	 }
	 	 if (foodItems == "Chicken Burger Comb"){
	  return 150.00*quantity;
	 }
	 	 if (foodItems == "Muffins"){
	  return 55.00*quantity;
	 }
	 	 if (foodItems == "Spaghetti"){
	  return 90.00*quantity;
	 }
	 	 if (foodItems == "Bread Jam"){
	  return 55.00*quantity;
	 }
	 	 if (foodItems == "Shawarma"){
	  return 80.00*quantity;
	 }
	 	 if (foodItems == "Chicken Shawarma"){
	  return 120.00*quantity;
	 }
	 	 if (foodItems == "Nuggets"){
	  return 60.00*quantity;
	 }
	 	 if (foodItems == "Corn Shots"){
	  return 60.00*quantity;
	 }
	 	 if (foodItems == "Crispy Corn"){
	  return 75.00*quantity;
	 }
	 	 if (foodItems == "Paneer Manchuri"){
	  return 100.00*quantity;
	 }
	 	 if (foodItems == "Cheese Maggie"){
	  return 55.00*quantity;
	 }
	 	 if (foodItems == "Cheese Tost"){
	  return 85.00*quantity;
	 }
	 	 if (foodItems == "Chco Lava Cake"){
	  return 95.00*quantity;
	 }
	 	 if (foodItems == "Red Velvet Cake"){
	  return 95.00*quantity;
	 }
	 	 if (foodItems == "Pan Cake"){
	  return 55.00*quantity;
	 }
	 else{
		 System.out.println("item not found");
	 }
	 return 0.0;
	 }
	 }
	 
	 