import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) {

        try {

            // Create object
            StringConcat obj = new StringConcatImpl();

            // Start registry
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind object
            registry.rebind("ConcatService", obj);

            System.out.println("Server is running...");

        }

        catch (Exception e) {

            e.printStackTrace();

        }
    }
}
