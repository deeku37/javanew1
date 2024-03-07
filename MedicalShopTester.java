class MedicalShopTester{
public static void main(String sportProducts[]){
	
	System.out.println("owner name is :" + MedicalShop.ownerName);
	System.out.println("owner address is :" + MedicalShop.address);
	
	MedicalShop.addProducts("Medical Instruments");
	MedicalShop.addProducts("Mask");
	MedicalShop.addProducts("Dressings");
	MedicalShop.addProducts("Anaesthesia supplies");
	MedicalShop.addProducts("Sterilization");
	MedicalShop.addProducts("Dialysis Supplies");
	MedicalShop.addProducts("Needles and syringes");
	MedicalShop.addProducts("Gloves");
	MedicalShop.addProducts("Hearing aids");
	MedicalShop.addProducts("Disinfectants");
	MedicalShop.getProducts();
	boolean isProductssAdded = MedicalShop.updateProducts("Hand Wash" , "Hearing aids");
	MedicalShop.getProducts();
}
}