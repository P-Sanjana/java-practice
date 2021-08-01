/*
Given a non-empty string s and a dictionary wordDict containing a list of non-empty
words, determine if s can be segmented into a space-separated sequence of one 
or more dictionary words.

Note:
The same word in the dictionary may be reused multiple times in the segmentation.
You may assume the dictionary does not contain duplicate words.

Example 1:
    Input:  applepenapple
            apple pen
    Output: true
    
    Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
    Note that you are allowed to reuse a dictionary word.

Example 2:
    Input:  catsandog
            cats dog sand and cat
    Output: false

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class WordBreak {
	
	 public static boolean wordBreak(String s, List<String> wordDict) {
        return backtrack(s, wordDict);
    }
    
    private static boolean backtrack(String remaining, List<String> wordDict) {
        if (remaining.isEmpty()) return true;
        for (String word : wordDict) {
            if (remaining.startsWith(word)) {
                if (backtrack(remaining.substring(word.length()), wordDict)) return true;
            }
        }
        return false;
    }
	 public static void main(String args[] ) throws IOException {

		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String s = br.readLine();
			String str = br.readLine();
			String[] strs = str.split(" ");	
			List<String> list=Arrays.asList(strs);
			System.out.println(wordBreak(s,list));  

			}
}