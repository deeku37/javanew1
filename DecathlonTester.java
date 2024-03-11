class DecathlonTester{
public static void main(String sportProducts[]){
	
	System.out.println("owner name is :" + Decathlon.ownerName);
	System.out.println("owner address is :" + Decathlon.address);
	
	Decathlon.addProducts("Tents");
	Decathlon.addProducts("Bicycle");
	Decathlon.addProducts("Scate Board");
	Decathlon.addProducts("Micro Fiber Towel");
	Decathlon.addProducts("football");
	Decathlon.addProducts("Rackets");
	Decathlon.addProducts("Yoga Mat");
	Decathlon.addProducts("Jackets");
	Decathlon.addProducts("Swim Suits");
	Decathlon.addProducts("Trekking Shoes");
	
	Decathlon.getProducts();
	boolean isUpdated= Decathlon.updateProducts("Trekking Bag" , "Trekking Shoes");
	Decathlon.getProducts();
	Decathlon.deleteProducts("football");
	Decathlon.getProducts();
}
}