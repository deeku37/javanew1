class PetShopTester{
public static void main(String sportProducts[]){
	
	System.out.println("owner name is :" + PetShop.ownerName);
	System.out.println("owner address is :" + PetShop.address);
	
	PetShop.addItems("Perfumes");
	PetShop.addItems("Rattles");
	PetShop.addItems("Belts");
	PetShop.addItems("Treats");
	PetShop.addItems("Cages");
	PetShop.addItems("Toys");
	PetShop.addItems("Grooming Kit");
	PetShop.addItems("Collars");
	PetShop.addItems("leashes");
	PetShop.addItems("Pedegree");
	
	PetShop.getItems();
	boolean isPetShopAdded = PetShop.updateItems("Royal Kennin" , "Pedegree");
	PetShop.getItems();
}
}