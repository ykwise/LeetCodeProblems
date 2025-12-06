import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;


public class ContainsDuplicateOptimal{
	
	public static boolean containsDuplicate(int[] nums) {
		
		Set <Integer> seen = new HashSet<>();
		for(int values : nums) {
			
			if(seen.contains(values)) {
				return true;
			}
			seen.add(values);
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("");
		
		System.out.println("Has duplicate: " + containsDuplicate(arr));
		
	
		 
		
	}
}