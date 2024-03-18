class ClothTester{

  public static void main (String clothCollection []){
    System.out.println("main started");
	
	
	/*Cloth cloth = new Cloth ();
	cloth.display();
	cloth.brandName = "H&m";
	cloth.material = "Nylon";
	cloth.price = 1500.00;
	cloth.size = "L";
	cloth.type = "Party";
	cloth.colour = "Red";
	cloth.display();
	
	Cloth cloth1 = new Cloth ();
	cloth1.display();
	cloth1.brandName = "H&m";
	cloth1.material = "Nylon";
	cloth1.price = 1500.00;
	cloth1.size = "L";
	cloth1.type = "Party";
	cloth1.colour = "Red";
	cloth1.display();
	
	Cloth cloth2 = new Cloth ();
	cloth2.display();
	cloth2.brandName = "Zara";
	cloth2.material = "Polyster";
	cloth2.price = 2000.00;
	cloth2.size = "M";
	cloth2.type = "Summer wear";
	cloth2.colour = "Navy Blue";
	cloth2.display();
	
	Cloth cloth3 = new Cloth ();
	cloth3.display();
	cloth3.brandName = "Alley Solly";
	cloth3.material = "Synthetic";
	cloth3.price = 1800.00;
	cloth3.size = "S";
	cloth3.type = "Office Wear";
	cloth3.colour = "Mustard Yellow";
	cloth3.display();*/
	
	Cloth cloth = new Cloth ("Roadster" , "Polyster", 1999.00 , "XL" , "Clasual Wear" , "Brown");
	    cloth.design();
	Cloth cloth1 = new Cloth ("H&M" , "Nylon", 1500.00 , "L" , "Party Wear" , "Red");
	    cloth1.design();
    Cloth cloth2 = new Cloth ("Zara" , "Cotton", 2000.00, "M" , "Ethnic Wear" , "Navy Blue");
	    cloth2.design();
    Cloth cloth3 = new Cloth ("Alley Solly" , "Synthetic",1800.00, "S" , "Office Wear" , "Mustard Yellow");
	    cloth3.design();
  
  }
}