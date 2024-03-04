class Solve{
public static void main(String ind[]){
print();
}
public static void print(){
int arr1[] = {97,13,86,24,33,52,28,52,4,29,13,26};
int  target = 30;
for(int i =0; i< arr1.length; i++){
 for (int j = i+1; j<arr1.length; j++){
 for (int k = j+1; k<arr1.length; k++){ 
if (arr1[i]+ arr1[j] + arr1[k] == target ){
	System.out.println(i+ " , " + j + ","+k);

}
}   
}
}
}
}


