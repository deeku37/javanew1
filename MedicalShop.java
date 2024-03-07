class MedicalShop{

		 static String ownerName = "Devan";
		 static String address = "HSR Layout";
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
public static boolean updateProducts(String newProducts, String oldProducts){
		    boolean isUpdated = false;
			System.out.println("Before updating the Products"); 
			 for(int index =0; index<products.length; index++){
				 if(products[index] == oldProducts){
					  //items[0] = "Hand Wash"
					  products[index] = newProducts;
                      isUpdated = true ;
               System.out.println("Products is added sucessfully");
			   
				 }
			 }
			 System.out.println("After updating the Products");
			        return isUpdated;
	 }
}
