class Country{
	public static void main(String india[]){
     
	String countryName[] = {"India"};
	String states[] = {"Karnataka", "Andhra Pradesh", "Goa", "Bihar", "Chhattisgarh", "Assam", "Gujarat", "Arunachal Pradesh", "Himachal Pradesh", "Jharkhand", "Uttar Pradesh", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur"};
	String cities[] = {"Panaji", "Delhi", "Patna", "Hyderabad", "Chennai", "Kolkata", "Ahmedabad", "Pune", "Jaipur", "Lucknow", "Kanpur", "Nagpur", "Raipur", "Indore", "Thane", "Bhopal", "Visakhapatnam", "Mumbai", "Coimbatore", "Vadodara"};
	
	System.out.println("countryName is " + countryName);
	System.out.println("states are");
	for(int index = states.length-1 ;  index>=0 ; index--){
		System.out.println(states[index] + "-->" +cities[index]);
	}
	
}
}

