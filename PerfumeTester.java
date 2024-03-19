class PerfumeTester{
public static void main(String perfumeCollection[]){
System.out.print("main  has started");
/*Perfume perfume = new Perfume();
perfume.design();
perfume.brandName = "Chanel";
perfume.price = 1899;
perfume.type = "liquid";
perfume.design();

Perfume perfume1 = new Perfume();
perfume1.design();
perfume1.brandName = "Gucci";
perfume1.price = 1500;
perfume1.type = "gas";
perfume1.design();

Perfume perfume2 = new Perfume();
perfume2.design();
perfume2.brandName = "Lancome";
perfume2.price = 6500;
perfume2.type = "liquid";
perfume2.design();*/
String ingredients [] = {"ethanol","linalool","benzyl salicylate"};
	Perfume Perf  = new Perfume(ingredients,"Chanel", "100ml" ,"liquid" ,1899,true);
	Perf.displayInfo();

	   System.out.println("main has ended");

/*Perfume perfume1  = new Perfume("Gucci",2999,"gas","250ml");
perfume1.design();
	   
	   
Perfume perfume2  = new Perfume("Lancome",6500,"liquid");
perfume2.design();*/

}
}
/*class PerfumeTester{
      public static void main(String per[]){
		  
		  System.out.println("main has started");
		  String ingredients[] = {"Rose water", "jasmine" , "floral nectar"};
		  
		  
	       Perfume perf  = new Perfume(ingredients , "Skinn" , "50 ml" , 1610.00 , true);
		   perf.displayInfo();
	  
	  
	     System.out.println("main has ended");
	  }


}*/