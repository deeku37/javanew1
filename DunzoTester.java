class DunzoTester{
public static void main(String items[]){
double price = Dunzo.search("tata tea");
System.out.println("price of tata tea is :" +price);

double priceWithQuantity = Dunzo.search("tata tea",3);
System.out.println("price of 3 tata tea is :" +priceWithQuantity);
}
}