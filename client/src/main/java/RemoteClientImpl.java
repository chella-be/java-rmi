import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RemoteClientImpl {

    private static RemoteInterface remoteInterface;

    public static void main(String[] args) {
        try {
            remoteInterface = (RemoteInterface) Naming.lookup("//localhost/hello");
            String response = remoteInterface.sayHello("Jacob");
            System.out.println(response);
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
