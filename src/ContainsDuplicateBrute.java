import java.util.Scanner;
public class ContainsDuplicateBrute {
	public static boolean containsDuplicate(int[] nums) {
		int n = nums.length;
		for(int i = 0;i < n; i++) {
			for(int j = i+1; j <n; j++) {
				if(nums[i] == nums[j]) {
					return true;
				}
				
				
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr = new int[len];
		for(int i=0; i<len; i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.print("");
		
		
		boolean hasDup = containsDuplicate(arr);
	
		System.out.println("Has Duplicate: " + hasDup);
		
	}
	

}
