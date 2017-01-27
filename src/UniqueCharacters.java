/**
 * Created by Kanishk on 1/26/17.
 */
public class UniqueCharacters
{
    public static void main(String[] args)
    {
        System.out.println("kanishk: " + isUniqueChars("kanishk"));
        System.out.println("ABcdefgh: " + isUniqueChars("ABcdefgh"));
    }

    //Assuming ASCII string so it only has 128 characters
    private static boolean isUniqueChars(String str)
    {
        if(str.length() > 128)
            return  false;

        boolean[] char_set = new boolean[128];
        for(int i = 0; i < str.length(); i++)
        {
            int val = str.charAt(i);
            if(char_set[val])
            {
                //Already found this char in the string
                return  false;
            }
            char_set[val] = true;
        }

        return  true;
    }
}
