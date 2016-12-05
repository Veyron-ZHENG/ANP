import java.rmi.Naming;

public class Server{
	public  static void main(String arg[]){
		Patient tom = new Patient(1001,"Tom",1967);
		Patient sarah = new Patient(1002,"Sarah",1986);
		Patient ben = new Patient(1003,"Ben",1975);
		Patient eileen = new Patient(1004,"Eileen",1984);
		
		
		try{
			QueryImpl q = new QueryImpl();
			q.pastients.add(tom);
			q.pastients.add(sarah);
			q.pastients.add(ben);
			q.pastients.add(eileen);
			Naming.rebind("QueryServer", q);
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("Server is ready");
	}
	
	
}
