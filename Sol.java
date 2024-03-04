class Sol{
public static void main(String ind[]){
print();
}
public static void print(){
int arr1[] = {2,7,11,15};
int  target = 13;
for(int i =0; i< arr1.length; i++){
 for (int j = i+1; j<arr1.length; j++){	
if (arr1[i]+ arr1[j] == target ){
	System.out.println(i+ " , " + j);

}
   
}
}
}
}