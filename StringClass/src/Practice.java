public class Practice {
    public static void main(String[] args)
    {
        String str = "  Hello,   World!  ";
        String trimmed = str.replaceAll("\\s", "");

        System.out.println("Trimmed string: " + trimmed);
    }
}
