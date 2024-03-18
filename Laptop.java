class Laptop{
String brandName;
double price;
String color;

/*public Laptop(){
	System.out.println("Laptop are used for gaming");
}*/

public Laptop(String brandName, double price, String color){
	System.out.println("Laptop are used for gaming");
           this.brandName = brandName;
           this.price = price;
           this.color = color;
	   }

public void computer(){
	System.out.println("brand name is" +brandName);
	System.out.println("price is" +price);
	System.out.println("color is" +color);

}
}