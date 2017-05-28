package remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected AdderRemote() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int add(int x, int y) throws RemoteException {
		// TODO Auto-generated method stub
		return x+y;
	}

}
