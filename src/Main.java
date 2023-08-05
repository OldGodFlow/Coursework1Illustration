public class Main {
    public static void main(String[] args) {
        String string = "123456789";
        int halfString = string.length() / 2;
        String string1 = string.substring(0, halfString);
        String string2 = string.substring(halfString, string.length());
        System.out.println(string);
        System.out.println(string1);
        System.out.println(string2);
    }
}