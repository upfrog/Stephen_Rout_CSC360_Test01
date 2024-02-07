/**
 * 
 */
package test_01;

/**
 * 
 */
public abstract class Employee
{

	PayMethod payMethod;
	protected double pay;
	protected int hoursWorked;
	protected String name;

	public Employee(double pay, String employeeName)
	{
		super();
		//this.payMethod = payMethod;
		this.pay = pay;
		this.name = employeeName;
		this.hoursWorked = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double fetchPay()
	{
		//return payMethod.getPay(hoursWorked, pay);
		return payMethod.calculatePay(this);
	}

	public void setEmployeeName(String employeeName)
	{
		this.name = employeeName;
	}

	public PayMethod getPayMethod()
	{
		return payMethod;
	}

	public void setPayMethod(PayMethod payMethod)
	{
		this.payMethod = payMethod;
	}

	public double getPay()
	{
		return pay;
	}

	public void setPay(double pay)
	{
		this.pay = pay;
	}

	public int getHoursWorked()
	{
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}
	
	public Employee()
	{
		
	}
	
}
