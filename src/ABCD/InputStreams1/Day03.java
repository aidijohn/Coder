package ABCD.InputStreams1;

import java.io.*;

public class Day03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if(N % 2 == 1){
            System.out.println("Weird");
        }
        else if(2 <= N && N <= 5){
            System.out.println("Not Weird");
        }
        else if(6 <= N && N <= 20){
            System.out.println("Weird");
        }
        else {
            System.out.println("Not Weird");
        }

        bufferedReader.close();
    }
}

//TASK
//ToDo: Enter a number in the console.
// Given an integer N for this input number, perform the following conditional actions:
//
//If N is odd, print 'N is odd'
//If N is even and in the inclusive range of 2 to 5, print 'N is even, btwn 1- 5'
//If N is even and in the inclusive range of 6 to 20, print 'N is even, btwn 6- 20'
//If N is even and greater than 20, print 'N is even, > 20'