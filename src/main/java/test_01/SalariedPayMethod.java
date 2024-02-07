package test_01;

public class SalariedPayMethod implements PayMethod
{
	public double calculatePay(Employee employee)
	{
		return employee.pay;
	}
}
