class DetergentTester{
public static void main(String det[]){
System.out.println("main started");
/*Detergent detergent = new Detergent();
detergent.design();
detergent.name = "Tide";
detergent.price = 200.00;
detergent.type = "powder";
detergent.design();

Detergent detergent1 = new Detergent();
detergent1.design();
detergent1.name = "Ariel";
detergent1.price = 400.00;
detergent1.type = "powder";
detergent1.design();

Detergent detergent2 = new Detergent();
detergent2.design();
detergent2.name = "Surf Excel";
detergent2.price = 300.00;
detergent2.type = "powder";
detergent2.design();*/
Detergent detergent  = new Detergent("Tide",200.00,"powder");
detergent.design();
	   

Detergent detergent1  = new Detergent("Ariel",400.00,"powder");
detergent1.design();
	   
	   
Detergent detergent2  = new Detergent("Surf Excel",300.00,"powder");
detergent2.design();

}
}