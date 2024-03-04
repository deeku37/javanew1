class Speaker{
static boolean isConnected ;
   
   //method
   public static boolean onOrOff(){
   System.out.println("inside onOrOff()");
   //false == false
   if(isConnected ==false){
   isConnected =true ;
    System.out.println("inside onOrOff()" + isConnected);
	}
   else if(isConnected ==true){
    isConnected = false;
	System.out.println("inside onOrOff()" + isConnected);

   }
   return isConnected;
   }


}