package remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyClient {
public static void main(String[] args) {
	try {
		Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/appy");
		System.out.println(stub.add(12, 3));
	} catch (MalformedURLException | RemoteException | NotBoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
