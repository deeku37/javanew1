class AutoMobileShopTester{
   public static void main (String accessories[]){
	   
	System.out.println("name is :" + AutoMobileShop.name);
	System.out.println("model Name is :" + AutoMobileShop.modelName);
	
	
   AutoMobileShop.addAccessories("radiator guard");
   AutoMobileShop.addAccessories("brake clutch levers");
   AutoMobileShop.addAccessories("baggage");
   AutoMobileShop.addAccessories("eCall");
   AutoMobileShop.addAccessories("handlebar");
   AutoMobileShop.addAccessories("seatr cover");
   AutoMobileShop.addAccessories("footpegs");
   AutoMobileShop.addAccessories("radiator grill");
   AutoMobileShop.addAccessories("seats");
   AutoMobileShop.addAccessories("centre stand");
   
   
  
  AutoMobileShop.getAccessories();
  AutoMobileShop.updateAccessories("mirror" , "seats");
	AutoMobileShop.getAccessories();
}
}