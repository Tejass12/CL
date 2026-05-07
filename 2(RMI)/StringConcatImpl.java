import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class StringConcatImpl extends UnicastRemoteObject implements StringConcat {

    protected StringConcatImpl() throws RemoteException {
        super();
    }

    @Override
    public String concat(String str1, String str2) throws RemoteException {

        return str1 + str2;

    }
}
