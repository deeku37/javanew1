class ClockTester{
public static void main(String time[]){
	 
	        /*Clock clock = new Clock();
			clock.displayInfo();
	                clock.brandName = "Ajanta";
			clock.shape = "Square";
			clock.price = 1200.00;
			clock.color = "Black";
			clock.material = "Metal";
			clock.displayInfo();

			
		Clock clock1 = new Clock();
			clock1.displayInfo();
	                clock1.brandName = "Chumbak";
			clock1.shape = "Circle";
			clock1.price = 2500.00;
			clock1.color = "Gray";
			clock1.material = "Silver";
			clock1.displayInfo();
			
			
		Clock clock2 = new Clock();
			clock2.displayInfo();
			clock2.brandName = "Casio";
			clock2.shape = "Pentagon";
			clock2.price = 1800.00;
			clock2.color = "Brown";
			clock2.material = "Titanium";
			clock2.displayInfo();*/

			
			Clock clock = new Clock("Ajanta","Square",1200.00,"White","Metal" );
			clock.watch();
			
			Clock clock1 = new Clock("Chumbak", "Circle",1000.00,"Gray","silver" );
			clock1.watch();
			
			Clock clock2 = new Clock("Casio","Pentagon",1800.00 ,"Brown","Titanium");
			clock2.watch();
	 }
}