import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StringConcat extends Remote {

    String concat(String str1, String str2) throws RemoteException;

}