public class CommandLineArgs {
    public static void main(String[] args)
    {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
// Command Line Arguments
// -> Values that we give to the java programs when we start the program
// -> Java recieves those values through String[] args in the main method

// args -> variable -> refers to array of Strings
// meaning the main() method can receive an array of strings

// To use other datatypes, convert using Integer.parse method.

//  What Java Does -
// 1. Program Launched
// 2. Java Launcher creates an args Array.
// 3. Passes it to main method().
// 4. Your Program decides whether to use it or not.