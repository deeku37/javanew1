class Perfume{
String brandName;
String material;
double price;
String size;
String color;
String type;

/*public Perfume(){
	System.out.println("used to give pleasant scent to body");
}*/

public Perfume(String brandName ,double price, String type){
	System.out.println("used to give pleasant scent to body");
           this.brandName = brandName;
           this.price = price;
            this.type = type;		   
	             
	   }

public void design(){
	System.out.println("brand name is" +brandName);
	System.out.println("price is" +price);
	System.out.println("type is" +type);
}
}