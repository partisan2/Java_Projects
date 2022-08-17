class TemporaryEmp extends Emp{
	
	private String endOfAppointment;
	
	TemporaryEmp(String name,int age,boolean married,String endOfAppointment){
		super(name,age,married);
		this.endOfAppointment = endOfAppointment;
	}
	
	public String getEndOfAppointment(){
		return endOfAppointment;
	}
	
	public void setEndOfAppointment(String dateEndOfAppointment){
		endOfAppointment = dateEndOfAppointment;
	}
	
	public double getSalary(){
		return super.getSalary() + 1000;
	}
	
	
}

