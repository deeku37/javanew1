class Soap{
    String ingredients[] = new String[5];
    String brandName;
	String volume;
	double price;
	boolean isMadeInIndia;
	
	public Soap(){
	
	}
	
	public Soap(String ingredients[] ,String brandName, String volume, double price, boolean isMadeInIndia){
	System.out.println("Soap constructor is invoked ");
	        this.ingredients = ingredients;
	        this.brandName = brandName;
	        this.volume = volume;
	        this.price = price;
			this.isMadeInIndia = isMadeInIndia ;
	}		
	
	public void displayInfo(){
		System.out.println("Soap info before init ");
		System.out.println("Soap brandName is " + brandName);
		System.out.println("Soap volume is " + volume);
		System.out.println("Soap price is " + price);
		System.out.println("Soap isMadeInIndia " + isMadeInIndia);
		System.out.println("ingredients Used : ");
		for(int index = 0 ; index < this.ingredients.length; index++){
		System.out.print(this.ingredients[index] +" ,");
		}
		System.out.println();
	}

}