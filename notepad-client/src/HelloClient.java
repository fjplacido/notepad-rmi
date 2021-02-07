import java.rmi.Naming;
import java.rmi.RemoteException;

public class HelloClient {

	public static void main(String[] args) {

		try {
			HelloInterface obj = (HelloInterface) Naming.lookup("//kvist.cs.umu.se/Hello");
			String message = obj.sayHello();
			System.out.println("Message from RMI Server: " + message);
		} catch (RemoteException e) {
			System.out.println("Access denied!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
