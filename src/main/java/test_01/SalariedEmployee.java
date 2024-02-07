package test_01;

public class SalariedEmployee extends Employee
{

	public SalariedEmployee(double pay, String employeeName)
	{
		super(pay, employeeName);
		this.payMethod = new SalariedPayMethod();
	}
	
}
