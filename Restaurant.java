class Restaurant{
 public static void main (String Level[]){
  String restaurantName = "Level";
  String restaurantLocation = " Jp Nagar";
  String restaurantOwnerName = " Arya";
   
   String dessert[] = {"Apple Pie", "Lava Cake","Tender Cocunt Pudding","Halwa","Buleberry Chees Cake","Black Forest Cake"};
   int dessertPrice [] = {220,200,200,250,450,500};
   String starters[] = {"French Fries","Masala Papad","Gobi","Corn Nuggets","Fried Chicken","Chiken Lollypop"};
   int startersPrice[] = {120,180,200,220,300,400};
   String mainCourse [] = {"Chicken Briyani","Fried Rice","Egg Briyani","Mutton Briyani","Peas Palav","Chicken Fried Rice"};
   int mainCoursePrice [] = {400,200,250,450,300,350};
   
   System.out.println("RestaurantName is" + restaurantName);
   System.out.println("RestaurantLocation is" + restaurantLocation);
   System.out.println("RestaurantOwnerName is"+ restaurantOwnerName);
   System.out.println("dessert are");
 for (int index = dessert.length-1; index>=0 ; index--){
	 System.out.println(dessert[index] + "--->" + dessertPrice[index]);
  }

	
  for(int index = starters.length-1; index>=0; index--){
	  System.out.println(starters[index] + "-->" + startersPrice[index]);
	  }
	
 for(int index = mainCourse.length-1; index>=0; index--){
	  System.out.println(mainCourse[index] + "-->" + mainCoursePrice[index]);
	  }
	

 }



}