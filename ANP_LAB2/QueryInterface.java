import java.rmi.Remote;
import java.rmi.RemoteException;

public interface QueryInterface extends Remote{
	public Patient getPatient(int id) throws RemoteException;
}
