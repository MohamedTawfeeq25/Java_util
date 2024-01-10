import java.util.*;
public class array_list{
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(50);
		arr.add(70);
		arr.clear();
		arr.add(90);
		arr.add(900);
		arr.add(123);
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.isEmpty());
		System.out.println(arr.contains(90));
	}
}