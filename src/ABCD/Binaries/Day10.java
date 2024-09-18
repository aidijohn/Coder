package ABCD.Binaries;

import java.io.*;

public class Day10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Whats your Integer?");
        int n = Integer.parseInt(bufferedReader.readLine().trim()); //trims any excess whitespace

        int count = 0;          //This keeps track of the current number of consecutive 1's.
        int highest_count = 0;  //This stores the highest number of consecutive 1's encountered

        do{
            if(n % 2 == 1){
                count++;
                if(highest_count < count){
                    highest_count = count;
                }
            }
            else if(n % 2 == 0){
                count = 0;
            }
            n = n / 2;
            
        }while(n >= 1);
        System.out.println(highest_count);

        bufferedReader.close();
    }
}

//TASK
//ToDo: Given a base-10 integer, n, convert it to binary (base-2).
// Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
// When working with different bases, it is common to show the base as a subscript.
//
//Example
//n = 125
//The binary representation of 125 is 1111101 base2. Print the maximum, 5.

//Example2
//n = 13
//binary => 1101 base 2
//output = 2