class HopComs{

		 static String ownerName = "Leo Vaas";
		 static String address = "Kengerii";
		 static String fruits[] = {null,null,null,null,null,null,null,null,null,null};
		 static int index;
//method	 
public static boolean addFruits(String fruit){
	System.out.println("inside addFruits():");
	boolean isAdded = false;
	if(fruit != null){
		fruits[index] = fruit;
		index++;
		isAdded = true;
	System.out.println("fruit added successfully");
	}
	else{
		System.out.println("fruits can't be null");
	}
	System.out.println("end of fruits");
	return isAdded;
}
// fetch data
public static void getFruits(){
	for(int index = 0; index < fruits.length; index++){
		System.out.println(fruits[index]);
		
	}
}
}
