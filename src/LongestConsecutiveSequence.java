import java.util.Set;
import java.util.HashSet;
public class LongestConsecutiveSequence {
	
	public static int longestConsecutiveSequence(int[] nums) {
		
		Set<Integer> s = new HashSet<>();
		
		for(int num : nums) {
			
			s.add(num);
		}
		int ans = 0;
		for(int num : nums) {
			
			if(!s.contains(num-1)) {
				
				int y=num+1;
				
				while(s.contains(y)) {
					
					++y;
				}
				
				ans= Math.max(ans, y-num);
				
			}
			
		}
		
		
		return ans;
		
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {0,1,2,5,19,20,21,27,29,32,36,51};
		
		System.out.println(longestConsecutiveSequence(arr));
		

	}

}
