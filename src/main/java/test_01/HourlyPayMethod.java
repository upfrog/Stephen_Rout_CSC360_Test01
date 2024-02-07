package test_01;

public class HourlyPayMethod implements PayMethod
{
	public double calculatePay(Employee employee)
	{
		double totalPay = 0;
		
		
		if (employee.hoursWorked > 40)
		{
			int hoursWorked = employee.hoursWorked;
			totalPay += 40*employee.pay;
			hoursWorked -= 40;
			totalPay += hoursWorked*employee.pay*1.5;
		}
		
		else
		{
			totalPay += employee.hoursWorked*employee.pay;
		}
		
		return totalPay;
	}
}
