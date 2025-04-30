import java.util.function.Consumer;
import java.util.function.BinaryOperator;

public class Lambdas {
    public static void main(String[] args) {

        // Custom functional interface
        Printable lambdaPrintable = (s) -> System.out.println("Hello World" + s);
        printThing(lambdaPrintable);

        // With no parameters
        Runnable r = () -> System.out.println("Hello from a thread");
        new Thread(r).start();

        // One parameter
        Consumer<String> printM = mensaje -> System.out.println(mensaje);
        printM.accept("Hola mundo");

        // Multiple parameters
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(3, 5));
    }

    // Example method (First lambda)
    static void printThing(Printable thing) {
        thing.print("!");
    }
}

// Functional interface for the first lambda
@FunctionalInterface
interface Printable {
    void print(String suffix);
}
