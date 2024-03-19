class PolarBear{
public static double search(String food){

if(food == "dark fantasy sundae"){
return 20.00;
}

if(food == "cookie monster sundae"){
return 40.00;
}

if(food == "hot chocolate fudge"){
return 60.00;
}

if(food == "rocky road fudge"){
return 20.00;
}

if(food == "brownie fudge"){
return 40.00;
}

if(food == "choco lava cake"){
return 60.00;
}

if(food == "brownie"){
return 20.00;
}

if(food == "ferrero rocher fudge"){
return 40.00;
}

if(food == "red velvet fudge"){
return 60.00;
}

if(food == "my dbc"){
return 20.00;
}

if(food == "dbc"){
return 40.00;
}

if(food == "classic dbc"){
return 60.00;
}

if(food == "gudbud sundae"){
return 20.00;
}

if(food == "fruit zest sundae"){
return 40.00;
}

if(food == "lychee sundae"){
return 60.00;
}
if(food == "blueberry bliss"){
return 20.00;
}

if(food == "mocha twist"){
return 40.00;
}

if(food == "tropical passion sundae"){
return 60.00;
}

if(food == "dry fruit special"){
return 20.00;
}

if(food == "classic banana split"){
return 40.00;
}
if(food == "triple luv sundae"){
return 60.00;
}

if(food == "ice cream pizza"){
return 20.00;
}

if(food == "banoffee sundae"){
return 40.00;
}

if(food == "seven wonders sundae"){
return 60.00;
}

if(food == "family pizza sundae"){
return 20.00;
}
return 0.0;
}
public static double search(String food, int quantity){

if(food == "dark fantasy sundae"){
return 20.00 *quantity;
}

if(food == "cookie monster sundae"){
return 40.00*quantity;
}

if(food == "hot chocolaate fudge"){
return 60.00*quantity;
}

if(food == "rocky road fudge"){
return 20.00*quantity;
}

if(food == "brownie fudge"){
return 40.00*quantity;
}

if(food == "choco lava cake"){
return 60.00*quantity;
}

if(food == "brownie"){
return 20.00*quantity;
}

if(food == "ferrero rocher fudge"){
return 40.00*quantity;
}

if(food == "red velvet fudge"){
return 60.00*quantity;
}

if(food == "my dbc"){
return 20.00*quantity;
}

if(food == "dbc"){
return 40.00*quantity;
}

if(food == "classic dbc"){
return 60.00*quantity;
}

if(food == "gudbud sundae"){
return 20.00*quantity;
}

if(food == "fruit zest sundae"){
return 40.00*quantity;
}

if(food == "lychee sundae"){
return 60.00*quantity;
}
if(food == "blueberry bliss"){
return 20.00*quantity;
}

if(food == "mocha twist"){
return 40.00*quantity;
}

if(food == "dry fruit special"){
return 60.00*quantity;
}

if(food == "classic banana split"){
return 20.00*quantity;
}

if(food =="triple luv sundae"){
return 40.00*quantity;
}
if(food == "ice cream pizza"){
return 60.00*quantity;
}

if(food == "banoffee sundae"){
return 20.00*quantity;
}

if(food == "seven wonders sundae"){
return 40.00*quantity;
}

if(food == "family pizza sundae"){
return 60.00*quantity;
}

if(food == "classic vanilla"){
return 20.00*quantity;
}

else{
System.out.println("item not found");
}
return 0.0;
}

}