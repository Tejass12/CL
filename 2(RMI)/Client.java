import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try {

            // Connect to registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Lookup remote object
            StringConcat stub = (StringConcat) registry.lookup("ConcatService");

            // Input
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first string: ");
            String str1 = sc.nextLine();

            System.out.print("Enter second string: ");
            String str2 = sc.nextLine();

            // Remote call
            String result = stub.concat(str1, str2);

            // Output
            System.out.println("Concatenated String: " + result);

        }

        catch (Exception e) {

            e.printStackTrace();

        }
    }
}
