import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagramsbrute {
	
	public static List<List<String>> groupAnagram(String[] str){
		HashMap<String,List<String>> h = new HashMap<>();
		
		
		
		for(String s:str) {
			
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String key = new String(c);
			h.computeIfAbsent(key,k -> new ArrayList<>()).add(s);
			
		}
		
		return new ArrayList<>(h.values());
		
		
	}
	
	public static void main(String[] args) {
		
		String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagram(str));
		
		
	}

}
