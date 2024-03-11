class BlinkIt{
public static double search(String food){

if(food == "mtr gulab jamun"){
return 20.00;
}

if(food == "juice"){
return 40.00;
}

if(food == "grocerry"){
return 60.00;
}

if(food == "oreo"){
return 20.00;
}

if(food == "moms magic"){
return 40.00;
}

if(food == "choco lava cake"){
return 60.00;
}

if(food == "brownie"){
return 20.00;
}

if(food == "ferrero rocher"){
return 40.00;
}

if(food == "rasgulla"){
return 60.00;
}

if(food == "soan papdi"){
return 20.00;
}

if(food == "hersheys chocolate syrup"){
return 40.00;
}

if(food == "b naturals guava"){
return 60.00;
}

if(food == "diet coke"){
return 20.00;
}

if(food == "thumbs up"){
return 40.00;
}

if(food == "pepsi"){
return 60.00;
}
if(food == "classic cold coffee"){
return 20.00;
}

if(food == "taj mahal tea"){
return 40.00;
}

if(food == "nescafe gold coffee"){
return 60.00;
}

if(food == "boost"){
return 20.00;
}

if(food == "horlicks"){
return 40.00;
}
if(food == "tata tea"){
return 60.00;
}

if(food == "grb ghee"){
return 20.00;
}

if(food == "tissue box"){
return 40.00;
}

if(food == "broom"){
return 60.00;
}

if(food == "scrubber"){
return 20.00;
}
return 0.0;
}
public static double search(String food, int quantity){

if(food == "mtr gulab jamun"){
return 20.00 *quantity;
}

if(food == "juice"){
return 40.00*quantity;
}

if(food == "grocerry"){
return 60.00*quantity;
}

if(food == "oreo"){
return 20.00*quantity;
}

if(food == "moms magic"){
return 40.00*quantity;
}

if(food == "choco lava cake"){
return 60.00*quantity;
}

if(food == "brownie"){
return 20.00*quantity;
}

if(food == "ferrero rocher"){
return 40.00*quantity;
}

if(food == "rasgulla"){
return 60.00*quantity;
}

if(food == "soan papdi"){
return 20.00*quantity;
}

if(food == "hersheys chocolate syrup"){
return 40.00*quantity;
}

if(food == "b naturals guava"){
return 60.00*quantity;
}

if(food == "diet coke"){
return 20.00*quantity;
}

if(food == "thumbs up"){
return 40.00*quantity;
}

if(food == "pepsi"){
return 60.00*quantity;
}
if(food == "classic cold coffee"){
return 20.00*quantity;
}

if(food == "taj mahal tea"){
return 40.00*quantity;
}

if(food == "nescafe gold coffee"){
return 60.00*quantity;
}

if(food == "boost"){
return 20.00*quantity;
}

if(food =="horlicks"){
return 40.00*quantity;
}
if(food == "tata tea"){
return 60.00*quantity;
}

if(food == "grb ghee"){
return 20.00*quantity;
}

if(food == "tissue box"){
return 40.00*quantity;
}

if(food == "broom"){
return 60.00*quantity;
}

if(food == "scrubber"){
return 20.00*quantity;
}

else{
System.out.println("item not found");
}
return 0.0;
}

}