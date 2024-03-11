class EcommerceTester{
public static void main(String sportProducts[]){
	
	System.out.println("application name is :" + Ecommerce.appName);
	
	Ecommerce.addProducts("Carry Bags");
	Ecommerce.addProducts("Landuary Baskets");
	Ecommerce.addProducts("Hoodie");
	Ecommerce.addProducts("Sd Card");
	Ecommerce.addProducts("Grooming Kit");
	Ecommerce.addProducts("Shoes");
	Ecommerce.addProducts("Watches");
	Ecommerce.addProducts("Shoes");
	Ecommerce.addProducts("Ethnic wear");
	Ecommerce.addProducts("Winter ware");
		Ecommerce.getProducts();
	boolean isProductsAdded = Ecommerce.updateProducts("Cluthes" , "Sd Card");
	Ecommerce.getProducts();
	Ecommerce.deleteProducts("Grooming Kit");
	Ecommerce.getProducts();
}
}