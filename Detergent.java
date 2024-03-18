class Detergent{
String name;
double price;
String type;

/*public Detergent(){
	System.out.println("Detergents are used for cleaning cloths");
}*/

public Detergent(String name ,double price,String type){
	System.out.println("Detergents are used for cleaning cloths");
           this.name = name;
           this.price = price;
            this.type = type;		   
	             
	   }

public void design(){
	System.out.println("name is" +name);
	System.out.println("price is" +price);
	System.out.println("type is" +type);
}
}