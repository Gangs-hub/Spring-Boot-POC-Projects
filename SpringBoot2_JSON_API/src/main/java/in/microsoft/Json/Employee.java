package in.microsoft.Json;

public class Employee {
	
	private int eId;
	private String ename;
	
	//Zero param 
	
	public Employee(){
		//super();
	}
	
	//All Parameter
	public Employee(int eId, String ename) {
		super();
		this.eId=eId;
		this.ename=ename;
		
		
	}
	
	
	//Getters
	public int getEid() {
		return eId;
	}
	
	//Setter
	public void setEid(int eId) {
		this.eId=eId;
	}
	
	public String getEname() {
		return ename;
	}
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", ename=" + ename + "]";
	}

	public void setEname(String ename) {
		this.ename=ename;
	}

}
