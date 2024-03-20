public class Person{
    private String personName ;
	private int age;
	private String address;
	private String gender;
	
	public Person(){
	   System.out.println("Person constructor is invoked");
	}
	   //setter and getter (method)
	   
	   public void setPersonName(String personName){
	       this.personName = personName;
	}
	   public String getPersonName(){
	      return this.personName;
	 }
	   public void setAge(int age){
	     this.age = age;
	   }
	   public int getAge(){
	     return this.age; 
	   }
	   public void setAddress(String address){
	     this.address = address;
	   }
	    public String  getAddress(){
	     return this.address; 
	   }
	   public void setGender(String gender){
	     this.gender = gender;
	   }
	    public String getGender(){
	     return this.gender;
	   }
	
}