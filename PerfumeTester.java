class PerfumeTester{
public static void main(String clothCollection[]){
System.out.println("main started");
/*Perfume perfume = new Perfume();
perfume.design();
perfume.brandName = "Chanel";
perfume.price = 1899.00;
perfume.type = "liquid";
perfume.design();

Perfume perfume1 = new Perfume();
perfume1.design();
perfume1.brandName = "Gucci";
perfume1.price = 1500.00;
perfume1.type = "gas";
perfume1.design();

Perfume perfume2 = new Perfume();
perfume2.design();
perfume2.brandName = "Lancome";
perfume2.price = 6500.00;
perfume2.type = "liquid";
perfume2.design();*/
Perfume perfume  = new Perfume("Chanel",1899.00,"liquid");
perfume.design();
	   

Perfume perfume1  = new Perfume("Gucci",2999.00,"gas");
perfume1.design();
	   
	   
Perfume perfume2  = new Perfume("Lancome",6500.00,"liquid");
perfume2.design();

}
}