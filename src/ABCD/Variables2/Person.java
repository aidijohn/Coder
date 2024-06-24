package ABCD.Variables2;
import java.util.*;

public class Person {
    private int age;    //instance variable
  
    public Person(int initialAge) {
          // Add some more code to run some checks on initialAge
          if(initialAge < 0){
              System.out.println("Age is not valid, setting age to 0.");
              age = 0;
          }
          else{
              age = initialAge;
          }
    }

    public void amIOld() {
          // Write code determining if this person's age is old and print the correct statement:
        System.out.println(age < 13 ? "You are young." : age < 18 ? "You are a teenager." : "You are old.");
    }

    public void yearPasses() {
          age++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();     //Read an integer T which represents the number of test cases.
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();     //For each Test case, read an integer age from the input.
            Person p = new Person(age); //Create a Person object p with the given age.
            p.amIOld();

            //Simulates the passage of three years by calling p.yearPasses() three times.
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();     //Calls p.amIOld() again to print the age classification after three years.
            System.out.println();   //Prints an empty line for separation between test cases.
        }
        sc.close();
    }
}

//TASK Day04
//ToDo 1: Difference btwn local, instance, class, final variables and how to use them.
// Why use static keyword on a variable?
// ..
// https://www.hackerrank.com/challenges/30-class-vs-instance/problem.
// Write a Person class with an instance variable, 'age', and a constructor that takes an integer, 'initialAge', as a parameter.
// The constructor must assign 'initialAge' to 'age' after confirming the argument passed as 'initialAge' is not negative;
// if a negative argument is passed as 'initialAge', the constructor should set 'age' to 0 and print 'Age is not valid, setting age to 0..'
// In addition, you must write the following instance methods:
// .
// .yearPasses() should increase the  instance variable by 1.
// .amIOld() should perform the following conditional actions:
        //If age<13, print 'You are young..'
        //If age>=13 and age<18, print 'You are a teenager..'
        //Otherwise, print You are old...

//Implement the Functionality.
//-Input the number of N continuous tests
//-Person inputs the age for each specific test.
//-Increment the inputed age by 3, i.e. run yearPasses 3 times.
//-Find out am I old?