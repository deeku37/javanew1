class Decathlon{

		 static String ownerName = "Abhilash";
		 static String address = "WhiteField";
		 static String products[] = {null,null,null,null,null,null,null,null,null,null};
		 static int index;
//method	 
public static boolean addProducts(String product){
	System.out.println("inside addProducts():");
	boolean isAdded = false;
	if(product != null){
		products[index] = product;
		index++;
		isAdded = true;
	System.out.println("product added successfully");
	}
	else{
		System.out.println("products can't be null");
	}
	System.out.println("end of products");
	return isAdded;
}
// fetch data
public static void getProducts(){
	for(int index = 0; index < products.length; index++){
		System.out.println(products[index]);
		
	}
}
  public static boolean updateProducts(String newProducts , String oldProducts){
	  boolean isUpdated = false ;
	  System.out.println("Before updating the product");
	  for (int index = 0 ; index<products.length; index++){
		  if (products[index] == oldProducts){
			  //products [0] = "Trekking Bag"
			  products[index] = newProducts;
			  isUpdated = true ;
			  System.out.println(" Poduct value is added sucessfully");
			  
		  }
	  }
	  System.out.println("After updating the product");
	  return isUpdated;
  }
  
}
