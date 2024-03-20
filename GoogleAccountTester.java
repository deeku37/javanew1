class GoogleAccountTester{
    
	public static void main (String GoogleAccount[]){
	
	GoogleAccount googleAccount = new GoogleAccount ();
	 
	 googleAccount .setFirstName("Mia");
	 googleAccount .setLastName("Gowda");
	 googleAccount .setDateOfBirth("31/09/1997");
	 googleAccount .setGender("Female");
	 googleAccount .setUserName("Miame11");
	 googleAccount .setEmail("Mia11@gamil.com");
	 System.out.println(googleAccount.getFirstName() + " " + googleAccount.getLastName() + " " + googleAccount.getDateOfBirth() + " " + googleAccount.getGender() + " "  + googleAccount.getUserName() + " " + googleAccount.getEmail());
   
   }
	
	}
