class permenentEmp extends Emp{
	
	private double yearlyBonus;
	private int annualLeaves;
	private int sickleave;
	
	permenentEmp(String name,int age,boolean married,int annualLeaves,int sickleave){
		
		super(name,age,married);
		this.annualLeaves = annualLeaves;
		this.sickleave = sickleave;
	}
	
	public double getYearlyBonus(){
		return yearlyBonus;
	}
	
	public void setYearlyBonus(double allocatedYearlyBonus){
		yearlyBonus = allocatedYearlyBonus;
	} 
	public int getAnnualLeaves(){
		return annualLeaves;
	}
	public int getSickLeaves(){
		return sickleave;
	}
	
	public double getSalary(){
		return super.getSalary()-(super.getSalary()/10);
	}
}


