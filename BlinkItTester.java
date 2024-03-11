class BlinkItTester{
public static void main(String items[]){
double price = BlinkIt.search("broom");
System.out.println("price of broomitem is :" +price);

double priceWithQuantity = BlinkIt.search("broom",3);
System.out.println("price of broom item is :" +priceWithQuantity);
}
}