class Cloth{
     
	 String brandName;
	 String material;
	 Double price;
	 String size;
	 String colour;
	 String type;
    
 /*public Cloth(){
	System.out.println("cloths are used to make style");
 }*/
 
	 public Cloth(String brandName ,String material , double price , String size , String colour ,String type){
		 System.out.println("cloths are used to make style");
		 this.brandName =brandName;
		 this.material =material;
		 this.price =price;
		 this.size =size;
		 this.colour =colour;
		 this.type =type;
	 }
		 /*System.out.println("brandName is "+ brandName);
		  /*system.out.println("material is "+ material);
		   /*System.out.println("price is "+ price);
		    /System.out.println("size is "+ size);
			 /System.out.println("colour is "+ colour);
			 /System.out.println("type is "+ type);*/
			 public void design(){
				 System.out.println("brand name is +brandName");
				 System.out.println("material is +material");
				 System.out.println("price  is +price");
				 System.out.println("size is +size");
				 System.out.println("colour is +colour");
				 System.out.println("type is +type");
				 
			 }
	 
	 
}








