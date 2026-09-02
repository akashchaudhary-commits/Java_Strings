public class CountOccurences {
    public static void main(String[] args)
    {
        String str = "AAkash Chaudhary";
        char target = 'f';
        int count = 0;
        for(int i=0;i<str.length()-1;i++)
        {
            if(target == str.charAt(i))
                count++;
        }

        System.out.println("Occurences of " + target + " is " + count);
    }
}
