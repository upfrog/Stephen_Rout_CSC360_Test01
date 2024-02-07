package test_01;

public class HourlyEmployee extends Employee
{

	public HourlyEmployee(double pay, String employeeName)
	{
		super(pay, employeeName);
		this.payMethod = new HourlyPayMethod();
	}

}
