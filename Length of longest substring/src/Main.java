import java.util.*;
class Solution{
	public int LengthOfLongestSubstring(String s) {
		int max = 0;
		HashSet<Character> hash = new HashSet<Character>();
		int i = 0;
		int j = 0;
		while(i<s.length() && j<s.length())
		{
			if(hash.contains(s.charAt(j)))
			{
				hash.remove(s.charAt(i));
				i = i+1;
			}
			else
			{
				hash.add(s.charAt(j));
				j = j+1;
				max = Math.max(j-i,max);
			}
		}
		return max;
	}
}
public class Main {

	public static void main(String[] args) {
		int answer = (new Solution()).LengthOfLongestSubstring("abcabcbb");
		System.out.println(answer);

	}

}
