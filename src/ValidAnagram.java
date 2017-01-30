/**
 * Created by Kanishk on 1/30/17.
 *
 Given two strings s and t, write a function to determine if t is an anagram of s.

 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.

 Note:
 You may assume the string contains only lowercase alphabets.
 */

import java.util.*;

public class ValidAnagram
{
    public static void main(String[] args)
    {
        String s="anagram";
        String t="nagaram";

        System.out.println(isAnagram(s,t));

        s="rat";
        t="car";

        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t)
    {
        return sort(s).equals(sort(t));
    }

    public static String sort(String s)
    {
        char[] content = s.toCharArray();

        Arrays.sort(content);
        return new String(content);
    }
}
