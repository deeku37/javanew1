class Dunzo{
public static double search(String food){

if(food == "dark fantasy"){
return 10.00;
}

if(food == "parle g"){
return 20.00;
}

if(food == "nutri choice"){
return 30.00;
}

if(food == "oreo"){
return 40.00;
}

if(food == "moms magic"){
return 50.00;
}

if(food == "choco lava cake"){
return 60.00;
}

if(food == "brownie"){
return 75.00;
}

if(food == "ferrero rocher"){
return 86.00;
}

if(food == "rasgulla"){
return 75.00;
}

if(food == "soan papdi"){
return 68.00;
}

if(food == "hersheys chocolate syrup"){
return 51.00;
}

if(food == "b naturals guava"){
return 45.00;
}

if(food == "diet coke"){
return 38.00;
}

if(food == "thumbs up"){
return 21.00;
}

if(food == "pepsi"){
return 15.00;
}
if(food == "classic cold coffee"){
return 25.00;
}

if(food == "taj mahal tea"){
return 39.00;
}

if(food == "nescafe gold coffee"){
return 48.00;
}

if(food == "boost"){
return 57.00;
}

if(food == "horlicks"){
return 66.00;
}
if(food == "tata tea"){
return 75.00;
}

if(food == "grb ghee"){
return 34.00;
}

if(food == "tissue box"){
return 63.00;
}

if(food == "broom"){
return 22.00;
}

if(food == "scrubber"){
return 41.00;
}
return 0.0;
}
public static double search(String food, int quantity){

if(food == "dark fantasy"){
return 10.00 *quantity;
}

if(food == "parle g"){
return 20.00*quantity;
}

if(food == "nutri choice"){
return 30.00*quantity;
}

if(food == "oreo"){
return 40.00*quantity;
}

if(food == "moms magic"){
return 50.00*quantity;
}

if(food == "choco lava cake"){
return 60.00*quantity;
}

if(food == "brownie"){
return 75.00*quantity;
}

if(food == "ferrero rocher"){
return 86.00*quantity;
}

if(food == "rasgulla"){
return 75.00*quantity;
}

if(food == "soan papdi"){
return 68.00*quantity;
}

if(food == "hersheys chocolate syrup"){
return 51.00*quantity;
}

if(food == "b naturals guava"){
return 45.00*quantity;
}

if(food == "diet coke"){
return 38.00*quantity;
}

if(food == "thumbs up"){
return 21.00*quantity;
}

if(food == "pepsi"){
return 15.00*quantity;
}
if(food == "classic cold coffee"){
return 25.00*quantity;
}

if(food == "taj mahal tea"){
return 39.00*quantity;
}

if(food == "nescafe gold coffee"){
return 48.00*quantity;
}

if(food == "boost"){
return 57.00*quantity;
}

if(food =="horlicks"){
return 66.00*quantity;
}
if(food == "tata tea"){
return 75.00*quantity;
}

if(food == "grb ghee"){
return 34.00*quantity;
}

if(food == "tissue box"){
return 63.00*quantity;
}

if(food == "broom"){
return 22.00*quantity;
}

if(food == "scrubber"){
return 41.00*quantity;
}

else{
System.out.println("item not found");
}
return 0.0;
}

}