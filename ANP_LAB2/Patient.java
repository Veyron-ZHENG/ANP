import java.io.Serializable;

public class Patient implements Serializable{
	private int id;
	private String name;
	private int yearOfBirth;
	public Patient(int id,String name,int year){
		this.id=id;
		this.name=name;
		this.yearOfBirth=year;
	}
	
	public int getID(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getBirth(){
		return this.yearOfBirth;
	}
	@Override
	public String toString(){
		return "ID:"+this.id+"\nName:"+this.name+"\nYear of birth:"+this.yearOfBirth;
	}
}
