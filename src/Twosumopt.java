import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Twosumopt {
	
	public static int[] twoSum(int[] nums,int target) {
		
		Map<Integer,Integer> h = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			
			h.put(nums[i], i);
		}
		
		for(int i=0; i<nums.length; i++) {
			
			int y = target - nums[i];
			
			if(h.containsKey(y) && h.get(y)!=i) {
				
				return new int[] {i,h.get(y)};
			}
					
					
		}
		
		return new int[] {};
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {9,6,2,1,4};
		int target = 13;
		
		System.out.println(Arrays.toString(twoSum(arr,target)));
	}

}
