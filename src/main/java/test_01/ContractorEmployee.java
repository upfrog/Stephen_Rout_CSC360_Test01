package test_01;

public class ContractorEmployee extends Employee
{

	public ContractorEmployee(double pay, String employeeName)
	{
		super(pay, employeeName);
		this.payMethod = new ContractorPayMethod();
	}

}
