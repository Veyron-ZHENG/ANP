import java.rmi.Naming;

public class Client {
	public static void main(String arg[]){
		int id = Integer.parseInt(arg[0]);
		System.out.println(id);
		String pServerURL="rmi://localhost/QueryServer";
		QueryInterface server = null;
		try {
			server = (QueryInterface) Naming.lookup(pServerURL);
			System.out.println(server.getPatient(id));
		} catch (Exception e){
			System.out.println(e);
		}
		
	}
}
