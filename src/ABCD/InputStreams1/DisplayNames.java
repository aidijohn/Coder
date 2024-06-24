package ABCD.InputStreams1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DisplayNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("Type names (type 'exit' to stop):");

        //We use a while (true) loop to continuously read names from the user until they type 'exit'.
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            names.add(name);
        }

        //Display names
        System.out.println("You typed in the following names:");
        for (String name : names) {
            System.out.println(name);
        }

        //It's good practice to close the scanner object when it's no longer needed to free up system resources.
        scanner.close();
    }
}