class MobileAccessories{
   // public static void main([])
	static String name = "SmartPhone";
	static String accessories[] = {null,null,null,null,null,null,null,null,null,null};
	static String modelName ="iphone";
	static String modelSeriesName = "15pro";
	static  int index;
	//method
	public static boolean addAccessories(String accessorie){
		//"Data Cable" !=null
		System.out.println("inside addAccessories():");
		boolean isAdded = false;
		if(accessories !=null){
			///code
			//accories[0] = "Data Cable";
			accessories[index]= accessorie;
			index++;
			isAdded = true;
			System.out.println("Accessories is added sucessfully......");	
		}
		else{
			System.out.println("Accesories can't be null");
		}
		System.out.println("End of addAccessories ()");
		return isAdded;
		
	}
	
       // FOR DATA TYPE
	   public static void getAccessories(){
		   for (int index=0; index<accessories.length; index++){
			   System.out.println(accessories [index]);
		   }
	   }


}

