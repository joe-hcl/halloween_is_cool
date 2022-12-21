package halloween_is_cool;

public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String f, String l, double s)
	{
			if (isValidSalary(s))
			{
				this.monthlySalary=s;
			}
			this.firstName=f;
			this.lastName=l;
			
	}
	public Employee()
	{
		this.monthlySalary=0;
		this.firstName="null";
		this.lastName = "null";
	}
	
	public void setFirstName(String f)
	{
		this.firstName = f;
	}
	
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	
	public void setLastName(String l)
	{
		this.lastName = l;
	}
	
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	
	public void setMonthlySalary(double d)
	{
			if (isValidSalary(d))
			{
			this.monthlySalary=d;
			}
	
	}
	
	
	public double getMonthlySalary()
	{
		return this.monthlySalary;
	}
	
	
	public boolean isValidSalary(double d)
	{
		boolean retVal = false;
		if (d>0)
		{
			retVal = true;
		}
		return retVal;
	}
	
	
	
	public void giveRaise()
	{
		this.monthlySalary = (2 * this.monthlySalary);
	}
	
	
	public String toString()
	{
		String p = this.firstName + " " + this.lastName;
		p += "\nSalary: " + this.monthlySalary;
		return p;
	}
}
