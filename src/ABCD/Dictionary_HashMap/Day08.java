package ABCD.Dictionary_HashMap;
import java.util.*;

class Day08 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        System.out.println("Phone Book Size/ Entries?");
        int n = in.nextInt();
        Dictionary<String, Integer> diary = new Hashtable<String, Integer>();
        System.out.println("Add entries in the form; name number");

        // Add entries to the phonebook
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            diary.put(name, phone);
        }
        System.out.println("Phone book complete, do your first name search..");

        // Search for names in the phonebook
        while (in.hasNext()) {       //while(true)  --can also work

            String s = in.next();   // Read the name to check

            // Retrieve the phone number associated with the name s from the diary
            Integer element = diary.get(s);
            if (element == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + element);
            }
            System.out.println("Search another name..");
        }
        in.close();
    }
}


//TASK (HashTable)
//ToDo: Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers.
// You will then be given an unknown number of names to query your phone book for. For each name queried, print the associated
// entry from your phone book on a new line in the form name=phoneNumber; if an entry for name is not found, print Not found instead.
//
//Note: Your phone book should be a Dictionary/Map/HashMap data structure.
//
//Input Format
//
//The first line contains an integer, n, denoting the number of entries in the phone book.
//Each of the n subsequent lines describes an entry in the form of 2 space-separated values on a single line.
// The first value is a friend's name, and the second value is an 8-digit phone number.
//
//After the n lines of phone book entries, there are an unknown number of lines of queries. Each line (query) contains a name
// to look up, and you must continue reading lines until there is no more input.
//
//Note: Names consist of lowercase English alphabetic letters and are first names only.

//Output Format
//
//On a new line for each query, print Not found if the name has no corresponding entry in the phone book; otherwise, print the
// full name and phoneNumber in the format name=phoneNumber.
//
//================================================================
//Sample Input
//
//3
//sam 99912222
//tom 11122222
//harry 12299933
//
//sam
//edward
//harry
//===============================================================
//Sample Output

//sam=99912222
//Not found
//harry=12299933