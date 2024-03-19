class Perfume{

   String ingredients[] = new  String[3]; 
   String brandName;
   String volume;
   String type;
   int price;
   boolean isMadeInIndia ;

   
  public Perfume(){
	System.out.println("used to impress");
}

public Perfume(String ingredients[],String brandName , String volume,String type,int price,boolean isMadeInIndia){
	System.out.println("used to impress");
	/*consturcted is invoked*/
	       this.ingredients = ingredients ;
           this.brandName = brandName;
           this.price = price;
		   this.volume = volume;
            this.type = type;
           this.isMadeInIndia = isMadeInIndia;			
	             
	   }

public void fragnace(){
	System.out.println("used to impress");
	
}
    public void displayInfo(){
		
	System.out.println("perfumes info before init");
	System.out.println("brand name is" +brandName);
	System.out.println("price is" +price);
	System.out.println("type is" +type);
	System.out.println("volume is" +volume);
	System.out.println("isMadeInIndia is" +isMadeInIndia);
	System.out.println("ingredients Used : ");
	for (int index=0; index<this.ingredients.length;index++){
	}
		System.out.println();
	
	
}
}