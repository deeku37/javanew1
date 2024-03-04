class Ac{
static boolean isOnOrOff;
public static boolean onOrOff(){
System.out.println("inside on or off");
if(isOnOrOff == false){
isOnOrOff = true;
System.out.println("is Ac turned on or not :" + isOnOrOff);
}
else if(isOnOrOff == true){
isOnOrOff = false;
System.out.println("is Ac turned on or not :" + isOnOrOff);
}
return isOnOrOff;
}
}