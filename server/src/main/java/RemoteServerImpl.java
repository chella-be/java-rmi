import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteServerImpl extends UnicastRemoteObject implements RemoteInterface{

    protected RemoteServerImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String message) throws RemoteException {
        return message+"!, Hello World!";
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("//localhost/hello",new RemoteServerImpl());
            System.err.println("Server ready");
        } catch (MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
