class Clock{
	  String brandName;
          String shape;
	  double price;
	  String color;
	  String material;

	  /*public Clock(){
	  System.out.println("clock constructor is invoked");
	  }*/

	  
	  public Clock(String brandName , String shape ,double price , String color , String material ){
	  System.out.println("clock constructor is invoked");
	           this.brandName = brandName;
			   this.shape = shape;
			   this.price = price;
			   this.color = color;
			   this.material= material;
	  
	  }
	  
	  public void watch(){
		  System.out.println("clock info before Init");
		  System.out.println("clock brandName is " + brandName);
		  System.out.println("clock material is " + shape);
		  System.out.println("clock price is " + price);
		  System.out.println("clock size is " + color);
		  System.out.println("clock color is " + material);
	  }



}