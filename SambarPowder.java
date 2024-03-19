class SambarPowder{
    String ingredients[] = new String[5];
    String brandName;
	String itemWeight;
    String itemForm;
	double price;
	boolean isMadeInIndia;
	
	public SambarPowder(){
	
	}
	
	public SambarPowder(String ingredients[] ,String brandName, String itemWeight,  String itemForm ,double price, boolean isMadeInIndia){
	System.out.println("SambarPowder constructor is invoked ");
	        this.ingredients = ingredients;
	        this.brandName = brandName;
	        this.itemWeight = itemWeight;
			this. itemForm =   itemForm;
	        this.price = price;
			this.isMadeInIndia = isMadeInIndia ;
	}		
	
	public void sambar(){
	System.out.println("used to make sambar");
	}
	
	public void displayInfo(){
		System.out.println("SambarPowder info before init ");
		System.out.println("SambarPowder brandName is " + brandName);
		System.out.println("SambarPowder itemWeight is " + itemWeight);
		System.out.println("SambarPowder itemForm is " + itemForm);
		System.out.println("SambarPowder price is " + price);
		System.out.println("SambarPowder isMadeInIndia " + isMadeInIndia);
		System.out.println("ingredients Used : ");
		for(int index = 0 ; index < this.ingredients.length; index++){
		System.out.print(this.ingredients[index] +" ,");
		}
		System.out.println();
	}

}