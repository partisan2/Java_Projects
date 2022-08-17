class Emp{

	private String name;
	private int age;
	private boolean married;
	
	private double salary;
	private String department;	
	
	Emp(String name,int age,boolean married){
			
		this.name = name;
		this.age = age;
		this.married = married;	
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public boolean getisMarried(){
		return married;
	}
	
	public void setSalary(double newsalary){
		salary = newsalary;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setDepartment(String newDepartment){
		department = newDepartment;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public void doWork(String workToDo){
		System.out.println("I am doing "+workToDo);
	}
}
	

