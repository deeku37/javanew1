class Oats{
    String ingredients[] = new String[1];
    String brandName;
	String itemWeight;
    String itemForm;
	double price;
	boolean isMadeInIndia;
	
	public Oats(){
	
	}
	
	public Oats(String ingredients[] ,String brandName, String itemWeight,  String itemForm ,double price, boolean isMadeInIndia){
	System.out.println("SambarPowder constructor is invoked ");
	        this.ingredients = ingredients;
	        this.brandName = brandName;
	        this.itemWeight = itemWeight;
			this. itemForm =   itemForm;
	        this.price = price;
			this.isMadeInIndia = isMadeInIndia ;
	}		
	

	
	public void displayInfo(){
		System.out.println("Oats info before init ");
		System.out.println("  Oats brandName iOatss " + brandName);
		System.out.println("Oats itemWeight is " + itemWeight);
		System.out.println("Oats itemForm is " + itemForm);
		System.out.println("Oats price is " + price);
		System.out.println("Oats isMadeInIndia " + isMadeInIndia);
		System.out.println("ingredients Used : ");
		for(int index = 0 ; index < this.ingredients.length; index++){
		System.out.print(this.ingredients[index] +" ,");
		}
		System.out.println();
	}

}