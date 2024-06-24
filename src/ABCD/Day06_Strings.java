package ABCD;

import java.util.*;

public class Day06_Strings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        in.nextLine();
        for (int t = 1; t <= T; t++) {
            String input = in.nextLine();

//            String odd = new String();
//            String even = new String();
            String odd = "";
            String even = "";


            for (int i = 0; i < input.length(); i++) {
                if (i % 2 == 0) {
                    even += input.charAt(i);
                } else {
                    odd += input.charAt(i);
                }
            }
            System.out.println(even + " " + odd);
        }
        in.close();       
    }
}


//TASK
//ToDo: Given a string, S, of length N that is indexed from 0 to N - 1, print its even-indexed and odd-indexed
// characters as 2 space-separated strings on a single line (see the Sample below for more detail).
// .But only for N number of test times defined.

//Example
//s = adbecf
//Print abc def