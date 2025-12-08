import java.util.Arrays;

public class Twosumbrute {
	
	public static  int[]  twoSum(int[] nums,int target) {
		
		int n = nums.length;
		
		for(int i=0; i<n ; i++) {
			
			for(int j=i+1; j<n; j++ ) {
				
				if(nums[i] + nums[j] == target) {
					
					return new int[] {i,j};
				}
			}
		}
		
		return new int[] {};
	}
	
	public static void main(String[] args) {
		
		int[] arr = {6,1,2,5,6};
		int target = 11;
		
		System.out.println(Arrays.toString(twoSum(arr,target)));
		
	
		
	}

}
