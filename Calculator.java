class Calculator{
  public static void main(String calculate[]){
    add(886,166);
    add(666,12);
	sub(123,66);
	sub(345,34);
    div(90,3);
    sqrt(18);	
    mul(14,25);
    sq(13,169);
    x(15);
   
  }
  //invoke a method 
    public static void add(int num1,int num2){
	   int result = num1+num2;
	   System.out.println(result);
	   }
	public static void sub(int num1,int num2){
		int result = num1-num2;
		System.out.println(result);
	}
	public static void div(int num1,int num2){
			int result = num1/num2;
			System.out.println(result);
		}
	
	public static void sqrt(int num1){
		int result = num1*num1;
		System.out.println(result);
		
	}
	public static void mul(int num1, int num2){
		int result = num1*num2;
		System.out.println(result);

	}
    public static void sq(int num1, int num2){
		double result = num2/num1;
		System.out.println(result);
	}
	public static void x(double num1){
		double result = 1/num1;
		System.out.println(result);
	}
	
	}