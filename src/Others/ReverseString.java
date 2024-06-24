package Others;

public class ReverseString {

    // Method to reverse a given string
    public String reverse(String str) {
        String reverse = "";
        int length = str.length();

        // Loop from the end of the string to the beginning
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }
}

//
//public class Others.ReverseString {
//
//    // Method to reverse a given string
//    public String reverse(String str) {
//        String reverse = "";
//        int length = str.length();
//
//        // Loop from the end of the string to the beginning
//        for (int i = length - 1; i >= 0; i--) {
//            reverse = reverse + str.charAt(i);
//        }
//
//        return reverse;
//    }
//
//    public static void main(String[] args) {
//        Others.ReverseString reverseString = new Others.ReverseString();
//        String reversed = reverseString.reverse("hello");
//        System.out.println(reversed);
//    }
//}
