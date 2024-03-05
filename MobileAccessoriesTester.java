class MobileAccessoriesTester{
   public static void main (String accessories []){
	   System.out.println("name is :" + MobileAccessories.name);
	System.out.println("model Name is :" + MobileAccessories.modelName);
	System.out.println("model Series Name is :" + MobileAccessories.modelSeriesName);
	
   MobileAccessories.addAccessories("Data Cable");
   MobileAccessories.addAccessories("Tempered Glass");
   MobileAccessories.addAccessories("Connectors");
   MobileAccessories.addAccessories("Battery");
   MobileAccessories.addAccessories("Camera Lens Attachements");
   MobileAccessories.addAccessories("Back Case & Cover");
   MobileAccessories.addAccessories("Lcds-Display");
   MobileAccessories.addAccessories("Arm Band");
   MobileAccessories.addAccessories("Phone Griper/Holder");
   MobileAccessories.addAccessories("Wire Charging Stand");
   
   
  
  MobileAccessories.getAccessories();
}
}