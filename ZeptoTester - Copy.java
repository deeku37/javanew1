class ZeptoTester{
public static void main(String items[]){
double price = Zepto.search("nutri choice");
System.out.println("price of nutri choice is :" +price);

double priceWithQuantity = Zepto.search("nutri choice",3);
System.out.println("price of 3 nutri choice is :" +priceWithQuantity);
}
}