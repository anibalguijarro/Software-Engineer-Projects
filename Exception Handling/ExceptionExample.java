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
        System.out.println("End of example 1\n");


        // Example 2 -> Using an independent method and catching a generic 'Exception'
        try {
            getInt();
        } catch (Exception e) {
            System.out.println("Error from method getInt()!!");
        }


        // Example 3 -> Using two catch statements
        try {

            int number2 = Integer.parseInt("Word");

        } catch (NumberFormatException | NullPointerException e) {

            System.out.println("Error from 'number2'");

        }


        // Example 4 -> Using 'finally'
        

    }

    private static void getInt() {
        int myInt = Integer.parseInt("pants");
    }
}
