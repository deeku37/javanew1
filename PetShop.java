import java.util.Arrays;
class PetShop{

		 static String ownerName = "Ravi";
		 static String address = "Mahalaxmi LAYOUT";
		 static String items[] = {null,null,null,null,null,null,null,null,null,null};
		 static int index;
//method	 
public static boolean addItems(String item){
	System.out.println("inside addItems():");
	boolean isAdded = false;
	if(item != null){
		items[index] = item;
		index++;
		isAdded = true;
	System.out.println("item added successfully");
	}
	else{
		System.out.println("items can't be null");
	}
	System.out.println("end of items");
	return isAdded;
}
// fetch data
public static void getItems(){
	for(int index = 0; index < items.length; index++){
		System.out.println(items[index]);
		
	}
}
 public static boolean updateItems(String newItems, String oldItems){
		    boolean isUpdated = false;
			System.out.println("Before updating the PetShop Item"); 
			 for(int index =0; index<items.length; index++){
				 if(items[index] == oldItems){
					  //items[0] = "Royal Kennin"
					  items[index] = newItems;
                      isUpdated = true ;
               System.out.println("PetShopItem is added sucessfully");
			   
				 }
			 }
			 System.out.println("After updating the PetShop Items");
			        return isUpdated;
	 }
     public static void deleteItems(String item){
// looping the item from array(item)
    int newIndex , oldIndex;
	System.out.println("PetShopItem  Cages has to be deleted");
     for (newIndex=0 ,oldIndex=0; oldIndex< items.length ; oldIndex++){
		 if(items[oldIndex] != item){
			 items[newIndex++] = items[oldIndex];
          
		 }
	 }
	 items = Arrays.copyOf(items , newIndex );
	 System.out.println("PetShopItem  Cages is deleted sucessfully");
			 return ;
  }
  
  
}

