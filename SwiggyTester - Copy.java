class SwiggyTester{
     public static void main(String menu[]){
	 
	 double price = Swiggy.search("Red Velvet Cake");
	 System.out.println("The Price of 1 Red Velvet Cake is :" + price);
	 double priceWithQuanity = Swiggy.search("Red Velvet Cake", 3);
	 System.out.println("The Price of 3 Red Velvet Cake is:" + priceWithQuanity);
	 
	 
	 
	 
	 }

}