// Student Name : Rachel O Shea
// Student ID : C00248457
// Date : 28/11/2025
// Purpose : Lab 9 Q2 - Test understanding of interfaces and inheritance in Java

public class Lab9q2
{
	public static void main(String[] args)
	{
		Car car1 = new Car("Focus", 1200, 80, 3500.0);	
		Hgv hgv1 = new Hgv(120, 6, 2, 50000.0);

		System.out.println("Car Type: " + car1.getType());				// Print car type
		System.out.println("Car Duty: " + car1.calculateDuty());		// Print car duty

		System.out.println("HGV Cargo Capacity: " + hgv1.getCargo());	// Print HGV cargo capacity
		System.out.println("HGV Duty: " + hgv1.calculateDuty());		// Print HGV duty
	}
}