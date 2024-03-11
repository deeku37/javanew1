class HealthAndGlowTester{
public static void main(String beautyProducts[]){
	

	System.out.println("shop address is :" + HealthAndGlow.address);
	
	HealthAndGlow.addProducts("soap");
	HealthAndGlow.addProducts("shampoo");
	HealthAndGlow.addProducts("lip balm");
	HealthAndGlow.addProducts("lipstick");
	HealthAndGlow.addProducts("facemask");
	HealthAndGlow.addProducts("facepack");
	HealthAndGlow.addProducts("face wash");
	HealthAndGlow.addProducts("face scrub");
	HealthAndGlow.addProducts("conditioner");
	HealthAndGlow.addProducts("hair spray");
	
	
	HealthAndGlow.getProducts();
	HealthAndGlow.updateProducts("powder" , "soap");
	HealthAndGlow.getProducts();
	
		HealthAndGlow.deleteProducts("hair spray");
	HealthAndGlow.getProducts();
}
}