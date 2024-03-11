class PolarBearTester{
public static void main(String items[]){
double price = PolarBear.search("seven wonders sundae");
System.out.println("price of seven wonders sundae item is :" +price);

double priceWithQuantity = PolarBear.search("seven wonders sundae",3);
System.out.println("price of seven wonders sundae item is :" +priceWithQuantity);
}
}