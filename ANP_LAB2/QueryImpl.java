import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class QueryImpl extends UnicastRemoteObject implements QueryInterface {
	protected QueryImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Patient> pastients=new ArrayList<Patient>();
	@Override
	public Patient getPatient(int id) throws RemoteException{
		for(int i=0;i<pastients.size();i++){
			if(pastients.get(i).getID()==id){
				return pastients.get(i);
			}
		}
		return null;
	}
	
}
