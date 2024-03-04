class Microwave{
static boolean isConnected;

public static boolean onOrOff(){
System.out.println("inside on or off");
if(isConnected == false){
isConnected = true;
System.out.println("is microwave connected :" + isConnected);
}
else if(isConnected == true){
isConnected = false;
System.out.println("is microwave connected :" + isConnected);
}
return isConnected;
}
}