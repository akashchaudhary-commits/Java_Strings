import java.util.Arrays;
public class AnagramString {
    public static void main(String[] args)
    {
        String str = "qwertyuiwer";
        String str2 = "fxhgrewqrew";

        if(str.length() != str2.length())
        {
            System.out.println("Not an Anagram");
        }
        char [] c = str.toCharArray();
        char [] c1 = str2.toCharArray();

        Arrays.sort(c);
        Arrays.sort(c1);

        if(Arrays.equals(c, c1))
        {
            System.out.println("The Strings are Anagram");
        }
        else{
            System.out.println("The String are not anagram");
        }
    }
}
