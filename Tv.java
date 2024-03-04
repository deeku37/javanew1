class Tv{
static boolean isTurnedOn;

public static boolean onOrOff(){
System.out.println("inside turned on or off");
if(isTurnedOn == false){
isTurnedOn = true;
System.out.println("is TV turned on :" + isTurnedOn);
}
else if(isTurnedOn == true){
isTurnedOn = false;
System.out.println("is Tv turned on :" + isTurnedOn);
}
return isTurnedOn;
}
}