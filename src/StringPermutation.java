/**
 * Created by Kanishk on 1/26/17.
 */
public class StringPermutation
{
    public static void main(String[] args)
    {
        System.out.println("kanishk kkinash: " + isPermutation("kanishk", "kkinash"));
        System.out.println("abc ABC: " + isPermutation("abc","ABC"));

        System.out.println("kanishk kkinash: " + permutation("kanishk", "kkinash"));
        System.out.println("abc ABC: " + permutation("abc","ABC"));
    }

    //using sort to check
    private static String sort(String s)
    {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    //Comparison is case sensitive and whitespace is significant
    private static boolean isPermutation(String s, String t)
    {
        if(s.length() != t.length())
            return false;

        return sort(s).equals(sort(t));
    }

    //Check if the two strings have the same character count
    private static boolean permutation(String s, String t)
    {
        if(s.length() != t.length())
            return false;
        int[] letters = new int[128]; //ASCII assumption

        char[] s_array = s.toCharArray();
        for(char c : s_array)
        {
            //count number of each char in s
            letters[c]++;
        }

        for(int i=0; i < t.length(); i++)
        {
            int c = t.charAt(i);
            letters[c]--;
            if(letters[c] < 0)
                return false;
        }

        return true;
    }
}
