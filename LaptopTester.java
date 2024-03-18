class LaptopTester{
public static void main(String system[]){
System.out.println("main started");

/*Laptop laptop = new Laptop();
Laptop.computer();
Laptop.brandName = "Asus";
Laptop.price = 60000.00;
Laptop.color = "Black";
Laptop.computer();

Laptop laptop1 = new Laptop();
Laptop.computer();
Laptop.brandName = "Mac book";
Laptop1.price = 90000.00;
Laptop2.color = "White";
Laptop.computer();

Laptop laptop2 = new Laptop();
Laptop.computer();
Laptop.brandName = "Hp";
Laptop2.price = 65000.00;
Laptop2.color = "Blue";
Laptop.computer();*/

Laptop laptop  = new Laptop("Asus", 60000.00,"Grey");
laptop.computer();
	   

Laptop laptop1  = new Laptop("Mac Book", 90000.00,"White");
laptop1.computer();
	   
	   
Laptop laptop2  = new Laptop("Hp", 65000.00,"Black");
laptop2.computer();

}
}