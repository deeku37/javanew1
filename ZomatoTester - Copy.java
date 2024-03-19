
class ZomatoTester{
     public static void main(String menu[]){
	 
	 double price = Zomato.search("Alfaham Chicken");
	 System.out.println("The Price of 1 Alfaham Chicken  is :" + price);
	 double priceWithQuanity = Zomato.search("Alfaham Chicken", 3);
	 System.out.println("The Price of 3 Alfaham Chicken is:" + priceWithQuanity);
	 
	 
	 
	 
	 }

}