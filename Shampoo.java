class Shampoo{
    String ingredients[] = new String[5];
    String brandName;
	String volume;
	double price;
	boolean isMadeInIndia;
	
	public Shampoo(){
	
	}
	
	public Shampoo(String ingredients[] ,String brandName, String volume, double price, boolean isMadeInIndia){
	System.out.println("Shampoo constructor is invoked ");
	        this.ingredients = ingredients;
	        this.brandName = brandName;
	        this.volume = volume;
	        this.price = price;
			this.isMadeInIndia = isMadeInIndia ;
	}		
	
	public void smooth(){
	System.out.println("used to wash hair");
	}
	
	public void displayInfo(){
		System.out.println("Shampoo info before init ");
		System.out.println("Shampoo brandName is " + brandName);
		System.out.println("Shampoo volume is " + volume);
		System.out.println("Shampoo price is " + price);
		System.out.println("Shampoo isMadeInIndia " + isMadeInIndia);
		System.out.println("ingredients Used : ");
		for(int index = 0 ; index < this.ingredients.length; index++){
		System.out.print(this.ingredients[index] +" ,");
		}
		System.out.println();
	}

}