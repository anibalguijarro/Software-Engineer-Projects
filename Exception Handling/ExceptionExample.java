public class ExceptionExample {
    public static void main(String[] args){

        // Example 1 -> Try-Catch using 'NumberFormatException'
        try {

            // Code that may cause an exception
            int number = Integer.parseInt("Word");

        } catch (NumberFormatException nfe) {

            // Code that we want to execute if this type of exception happens
            System.out.println("Error! Can't make an int out of that.");

        }
        System.out.println(">> End of example 1 << \n");


        // Example 2 -> Using an independent method and catching a generic 'Exception'
        try {
            getInt();
        } catch (Exception e) {
            System.out.println("Error from method getInt()!!");
        }
        System.out.println(">> End of example 2 << \n");


        // Example 3 -> Using two catch statements
        try {

            int number2 = Integer.parseInt("Word");

        } catch (NumberFormatException | NullPointerException e) {

            System.out.println("Error from 'number2'");

        }
        System.out.println(">> End of example 3 << \n");


        // Example 4 -> Using 'finally'
        try{
            int number3 = Integer.parseInt("Word");
            System.out.println("After parsing Word..."); // This line won't execute if an exception occurs above
        }
        catch(NumberFormatException nfe){
            System.out.println("Error catched from Example 4");
        }
        finally{
            System.out.println("In the finally block"); // THIS LINE WILL ALWAYS EXECUTE
        }
        System.out.println(">> End of example 4 << \n");


        // Example 5 -> How the 'return' statement works with exception handling
        System.out.println(printNumber());
        System.out.println(">> End of example 5 << \n");
    }

    private static void getInt() {
        int myInt = Integer.parseInt("pants");
    }

    // This method demonstrates how return values behave in try-catch-finally blocks
    private static int printNumber() {
        try {

            return 3; // This would be returned...

        } catch (Exception e) {

            return 4; // ...unless an exception happens here

        } finally {

            return 5; // ...but this return will always override the others

        }
    }

}
