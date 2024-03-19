class ProtienBar{
    String ingredients[] = new String[5];
    String brandName;
	String itemWeight;
    String itemForm;
	double price;
	boolean isMadeInIndia;
	
	public ProtienBar(){
	
	}
	
	public ProtienBar(String ingredients[] ,String brandName, String itemWeight,  String itemForm ,double price, boolean isMadeInIndia){
	System.out.println("ProtienBar constructor is invoked ");
	        this.ingredients = ingredients;
	        this.brandName = brandName;
	        this.itemWeight = itemWeight;
			this. itemForm =   itemForm;
	        this.price = price;
			this.isMadeInIndia = isMadeInIndia ;
	}		
	

	
	public void displayInfo(){
		System.out.println("ProtienBar info before init ");
		System.out.println("ProtienBar brandName iOatss " + brandName);
		System.out.println("ProtienBar itemWeight is " + itemWeight);
		System.out.println("ProtienBar is " + itemForm);
		System.out.println("ProtienBar is " + price);
		System.out.println("ProtienBar isMadeInIndia " + isMadeInIndia);
		System.out.println("ingredients Used : ");
		for(int index = 0 ; index < this.ingredients.length; index++){
		System.out.print(this.ingredients[index] +" ,");
		}
		System.out.println();
	}

}