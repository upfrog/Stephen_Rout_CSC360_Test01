package test_01;

public class ContractorPayMethod implements PayMethod
{
	public double calculatePay(Employee employee)
	{
		return employee.hoursWorked*employee.pay;
	}
}
