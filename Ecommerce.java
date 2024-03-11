import java.util.Arrays;
class Ecommerce{

		 static String appName = "Myntra";
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
					  //items[0] = ""
					  products[index] = newProducts;
                      isUpdated = true ;
               System.out.println("Products is added sucessfully");
			   
				 }
			 }
			 System.out.println("After updating the Products");
			        return isUpdated;
	 }
	    public static void deleteProducts(String product){
// looping the product from array(product)
    int newIndex , oldIndex;
	System.out.println("Products Grooming Kit has to be deleted");
     for (newIndex=0 ,oldIndex=0; oldIndex< products.length ; oldIndex++){
		 if(products[oldIndex] != product){
			 products[newIndex++] = products[oldIndex];
          
		 }
	 }
	 products = Arrays.copyOf(products, newIndex );
	 System.out.println("Products Grooming Kit is deleted sucessfully");
			 return ;
  }
  }

