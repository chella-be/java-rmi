import java.rmi.RemoteException;

public interface RemoteInterface {
    String sayHello(String message) throws RemoteException;
}
