package ABCD.Variables2;

public class VariableTypes {
    // Class variable (static field)
    static int classVariable = 10;

    // Instance variable (non-static field)
    int instanceVariable = 20;

    public static void main(String[] args) {
        // Local variable
        int localVariable = 30;

        // Creating an instance of the class
        VariableTypes obj = new VariableTypes();

        // Accessing instance variable
        System.out.println("Instance Variable: " + obj.instanceVariable);

        // Accessing class variable
        System.out.println("Class Variable: " + classVariable);

        // Accessing local variable
        System.out.println("Local Variable: " + localVariable);

        // Demonstrating final variable
        final int finalVariable = 40;
        // finalVariable = 50; // This will cause a compilation error
        System.out.println("Final Variable: " + finalVariable);
    }

    // Method with a parameter
    public void methodWithParameter(int parameter) {
        System.out.println("Parameter: " + parameter);
    }
}
