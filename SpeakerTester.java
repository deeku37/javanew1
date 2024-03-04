class SpeakerTester{
  public static void main(String jbl[]){
  
   boolean isConnected = Speaker.onOrOff();
   System.out.println("Finally Speaker is Connected :" + isConnected);

   boolean isConnected1 = Speaker.onOrOff();
   System.out.println("Finally Speaker is Connected1 ;" + isConnected1);   
  }
}