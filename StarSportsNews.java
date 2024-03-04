class StarSportsNews{
  public static void main(String Batsmen[]){
  
    String sportsNewsName[] = {"StarSports"};
    String top10Batsmen[] = {"Rohit Sharma","Virat Kohli","M.S.Dhoni","SachinTendulkar","RahulDravid","Saurav Ganguly","Virender Sehwag","KapilDev","SunilGavaskar","AnilKumble"};
    String top10WomenBatsmen [] = {"Mithali Raj","Jhulan Goswami","Harmanpreet Kaur","Anjum Chopra","SmritiMandhana","Neetu David", "Jemimah Rodrigues", "Shikha Pandey ", "Shafali Verma", "Deepti Sharma"};
    String top10Bowlers [] = {"Kapil Dev","Zaheer Khan","Harbhajan Singh","Ishant Sharma","Ajit Agarkar","Erapalli Prasanna","Anil Kumble","Ravichandran Ashwin","Bhuvneshwar Kumar", "Jasprit Bumrah"};
    String top10Odi[] = {"India vs Australia", "West Indies vs Sri Lanka", "India vs England", "South Africa vs Pakistan", "Australia vs Bangladesh", "Pakistan vs Afghanistan", "England vs New Zealand", "New Zealand vs West Indies", "Sri Lanka vs Bangladesh", "Australia vs South Africa"};

	System.out.println("sportsNewsName is " + sportsNewsName);
	System.out.println("List of top10Batsmen are");
	 for(int index= top10Batsmen.length-1 ; index>=0; index--){
	  System.out.println(top10Batsmen[index]);
	 }
	System.out.println("List of top10WomenBatsmen");
      for(int index= top10WomenBatsmen.length-1; index>=0; index--){
	   System.out.println(top10WomenBatsmen [index]);
	  }	
	System.out.println("List of top10Bowlers are ");
       for(int index= top10Bowlers.length-1; index>=0; index--){
	    System.out.println(top10Bowlers [index]);
	   }	
	System.out.println("List of top10Odi are ");
	   for(int index= top10Odi.length-1; index>=0; index--){
	    System.out.println(top10Odi [index]);
	   }
   
   }
}
	 
  