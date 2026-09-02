public class StringPalindrome {
    public static void main(String[] args)
    {
        String str = "naman";
        String reverse = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse += str.charAt(i);
        }
        if(reverse.equals(str))
        {
            System.out.println(str + " is Palindrome");
        }
        else{
            System.out.println(str + " not Palindrome");
        }
    }
}
