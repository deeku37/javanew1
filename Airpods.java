class Airpods{
static boolean isConnected;

public static boolean onOrOff(){
System.out.println("inside on or off");
if(isConnected == false){
isConnected = true;
System.out.println("is Airpods connected :" + isConnected);
}
else if(isConnected == true){
isConnected = false;
System.out.println("is Airpods connected :" + isConnected);
}
return isConnected;
}
}