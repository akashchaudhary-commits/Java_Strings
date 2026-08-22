public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s2.charAt(0));
        String s3 = new String("Hello");
        char[] s4 = {'a','b','c'};
        String s5 = new String(s4);
        System.out.println(s4);
        System.out.println(s5);
        //System.out.println(s4.toUpperCase());
        System.out.println(s5.toUpperCase());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        if(s1 == s2)
            System.out.println("True");
        else
            System.out.println("False");
        if(s1 == s3)
            System.out.println("True");
        else
            System.out.println("False");


        String asd = "hviaeubeia";
        String hbx = "kjvbbvekbeb";


        // Strings are immutable
        char[] arr = {'q','w','e','r'};
        System.out.println(arr);
        arr[0] = 't';
        System.out.println(arr);

        String a = "Akash";
        a = "Dkash";
        System.out.println(a);
    }
}
