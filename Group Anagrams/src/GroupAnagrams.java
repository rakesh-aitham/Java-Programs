import java.util.*;
public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs)
	{
		List<List<String>> result = new ArrayList<>();
		HashMap<String, List<String>> map = new HashMap<>();
		for(String str:strs)
		{
			char[] chArr=str.toCharArray();
			Arrays.sort(chArr);
			String key = new String(chArr);
			if(map.containsKey(key))
			{
				map.get(key).add(str);
			}
			else
			{
				List<String> strlst = new ArrayList<>();
				strlst.add(str);
				map.put(key, strlst);
			}
		}
		result.addAll(map.values());
		return result;
	}

	public static void main(String[] args) {
		String strs[]= {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> result = groupAnagrams(strs);
		result.forEach(t->System.out.println(t+" "));
	}

}
