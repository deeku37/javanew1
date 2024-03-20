class PersonTester {
   
   public static void main(String personData[]){
     Person person = new Person();
	 
	 person.setPersonName("Merra");
	 person.setAge(25);
	 person.setAddress("Chandra Layout");
	 person.setGender("Female");
	 
	 System.out.println(person.getPersonName() + " " + person.getAge() + " " + person.getAddress() + " " + person.getGender());
   
   }
}