package test_01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PayrollTest
{
	Employee Stephen;
	Employee Joe;
	Employee Patrick;
	Employee David;
	Employee Tom;
	Payroll company;
	
	@BeforeEach
	void setup()
	{
		//Company declarations
		company = new Payroll();
		David = company.newEmployee(10, "David Trin", 1);
		Tom = company.newEmployee(15, "Tom Jerome", 1);
		
		//Direct employee declarations
		Stephen = new HourlyEmployee(20.00, "Stephen Rout");
		Joe = new ContractorEmployee(20.00, "Joe Smith");
		Patrick = new SalariedEmployee(2500.00, "Patrick McKenzie");
	}
	
	@Test
	void testEmployeeCreation()
	{
		//Testing HourlyEmployee
		assertEquals("Stephen Rout", Stephen.getName());
		assertEquals(20.00, Stephen.getPay());
		Stephen.setHoursWorked(40);
		assertEquals(40, Stephen.getHoursWorked());
		assertEquals(800.00, Stephen.fetchPay());
		Stephen.setHoursWorked(45);
		assertEquals(950.00, Stephen.fetchPay());

		
		//Testing ContractorEmployee
		Joe.setHoursWorked(60);
		assertEquals(1200.00, Joe.fetchPay());
		
		
		//Testing SalariedEmployee
		assertEquals(2500.00, Patrick.fetchPay());
		
		
		//Testing company structure
		David.setHoursWorked(55);
		Tom.setHoursWorked(40);
		assertEquals(625.00, David.fetchPay());
		assertEquals(600.00, Tom.fetchPay());
		assertEquals(David.fetchPay()+Tom.fetchPay(), company.calculatePayroll());
		
	}
}