class FactorialNcr{
public static void main (String factorial[]){
 int ncr = fact(9)/ (fact(9-7)*fact(7)); 
 System.out.println(ncr);
 }
 public static int fact (int factNumber){
 int fact=1;
 for(int f =1 ; f <=factNumber; f++){
  fact = fact * f;
  }
  return fact; 
 }
 
}