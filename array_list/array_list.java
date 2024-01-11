import java.util.*;
public class array_list{
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();//initialize the arraylist with datatype
		arr.add(10);//add() is used to add items to arraylist
		arr.add(50);
		arr.add(70);
		arr.clear();//clear() is used to empty the arraylist
		arr.add(90);
		arr.add(900);
		arr.add(123);
		System.out.println(arr.get(0));//get() is used to return data with index number
		System.out.println(arr.get(1));
		System.out.println(arr.isEmpty());//isEmpty() is used to check whether the arraylist is empty or not
		System.out.println(arr.contains(90));//contains() is used to check whether the item is present in the list
		arr.remove(0);//it is used to remove data with index id
		for(int i:arr){//loop over the array list
			System.out.println(i);
		}
		Collections.sort(arr);//sort the arraylist
	}
}