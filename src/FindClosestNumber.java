
public class FindClosestNumber {
	
	public static int findClosestNum(int[] nums) {
		
		int closest = nums[0];
		
		for(int num : nums) {
			
			if(Math.abs(num) < Math.abs(closest)) {
				
				closest = num;
			}else if(Math.abs(num) == Math.abs(closest)){
				
				closest = Math.max(num, closest);
				
				
			}
			
		}
		
		return closest;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {-10,-11,-5,-4,-6};
		System.out.println(findClosestNum(arr));
	}

}
