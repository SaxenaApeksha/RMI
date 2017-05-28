package remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class MyServer {

	public static void main(String[] args) {
		try {
			Adder stub = new AdderRemote();
			Naming.rebind("rmi://localhost:5000/appy", stub);
		} catch (RemoteException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

