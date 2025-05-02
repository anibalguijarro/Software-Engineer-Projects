class Exception{
    public static void main(String[] args){

        try{
            // Code that may cause an exception
            int number = Integer.parseInt("Word");
        }
        catch(NumberFormatException nfe){
            // Code that we want to execute if this type of exception happens
            System.out.println("Error! Can't make an Int out of that.");
        }

        System.out.println("End of program");

    }


}