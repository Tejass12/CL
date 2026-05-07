import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    public static void main(String[] args) {

        try {

            Hotel obj = new HotelImpl();

            Registry registry =
                    LocateRegistry.createRegistry(1099);

            registry.rebind("HotelService", obj);

            System.out.println("Hotel Server is running...");

        }

        catch (Exception e) {

            e.printStackTrace();

        }
    }
}
