import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer extends UnicastRemoteObject implements HelloInterface {

	private static final long serialVersionUID = 1L;

	public HelloServer() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() throws RemoteException {
		System.out.println("Method invocation!");
		return "Hello from server!";
	}

	public static void main(String[] args) {

		try {

			HelloServer obj = new HelloServer();

			Naming.rebind("RMI://127.0.0.1:1099/Hello", obj);

			System.out.println("Ligado no registro");

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
