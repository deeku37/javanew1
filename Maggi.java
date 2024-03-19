class Maggi{
    String ingredients[] = new String[5];
    String brandName;
	String volume;
	double price;
	boolean isMadeInIndia;
	
	public Maggi(){
	
	}
	
	public Maggi(String ingredients[] ,String brandName, String volume, double price, boolean isMadeInIndia){
	System.out.println("Maggi constructor is invoked ");
	        this.ingredients = ingredients;
	        this.brandName = brandName;
	        this.volume = volume;
	        this.price = price;
			this.isMadeInIndia = isMadeInIndia ;
	}		
	
	public void food(){
	System.out.println("Maggi is a fastfood");
	}
	
	public void displayInfo(){
		System.out.println("Maggi info before init ");
		System.out.println("Maggi brandName is " + brandName);
		System.out.println("Maggi volume is " + volume);
		System.out.println("Maggi price is " + price);
		System.out.println("Maggi isMadeInIndia " + isMadeInIndia);
		System.out.println("ingredients Used : ");
		for(int index = 0 ; index < this.ingredients.length; index++){
		System.out.print(this.ingredients[index] +" ,");
		}
		System.out.println();
	}

}