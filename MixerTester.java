class MixerTester{
 public static void main(String butterfly[]){
	 
	boolean isConnected = Mixer.onOrOff();
	System.out.println("finally is mixer connected :" + isConnected);
	
	boolean isConnected1 = Mixer.onOrOff();
	System.out.println("finally is mixer connected :" + isConnected1);
	
 }
}