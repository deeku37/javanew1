class InstaMartTester{
     public static void main(String menu[]){
	 
	 double price = InstaMart.search("Cashew Nuts");
	 System.out.println("The Price of 1 Cashew Nuts  is :" + price);
	 double priceWithQuanity = InstaMart.search("Cashew Nuts", 5);
	 System.out.println("The Price of 5 Cashew Nuts is:" + priceWithQuanity);
	 
	 
	 
	 
	 }

}