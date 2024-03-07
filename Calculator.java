class Calculator{
  public static void main(String calculate[]){
	  
   int total1 =add(886,166);
    System.out.println(total1);
	
	int total2  =sub(123,66);
	System.out.println(total2);
	
    double total3 =div(90,3);
	System.out.println(total3);
	
    int total4 =sqrt(18);
    System.out.println(total4);	
	
    int total5 =mul(14,25);
	System.out.println(total5);
	
    double total6 =sq(13,169);
	System.out.println(total6);
	
    double total7 =x(15);
	System.out.println(total7);
	
    int total8 =add(886,166,123);
    System.out.println(total8);
	
	int total9 =sub(886,166,120);
    System.out.println(total9);
	
	double total10 =div(886,166,120);
    System.out.println(total10);
	
	int total11 =mul(886,166,120);
    System.out.println(total11);
   
  }
  //invoke a method 
    public static int add(int num1,int num2){
	   int result = num1+num2;
	   return result;
	   }
	       public static int add(int num1,int num2, int num3){
	   int result = num1+num2+num3;
	   return result;
	   }
	public static int sub(int num1,int num2){
		int result = num1-num2;
		return result;
	}
		public static int sub(int num1,int num2,int num3){
		int result = num1-num2-num3;
		return result;
	}
	public static double div(double num1,double num2){
			double result = num1/num2;
			return result;
		}
			public static double div(double num1,double num2,double num3){
			double result = num1/num2/num3;
			return result;
		}
	
	public static int sqrt(int num1){
		int result = num1*num1;
		return result;
		
	}
	public static int mul(int num1, int num2){
		int result = num1*num2;
		return result;

	}
		public static int mul(int num1, int num2,int num3){
		int result = num1*num2*num3;
		return result;

	}
    public static double sq(int num1, int num2){
		double result = num2/num1;
return result;
	}
	public static double x(double num1){
		double result = 1/num1;
return result;
	}
	
	}