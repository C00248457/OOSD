// Student Name : Rachel O Shea
// Student ID : C00248457
// Date : 28/11/2025
// Purpose : Lab 9 Q2 - Test understanding of interfaces and inheritance in Java

public class Car extends RoadVehicle implements ImportDuty
{
	private String carType;
    private double price;
 
	public Car() {
	 	this("", 0, 0, 0.0);
	 	}
 
	public Car(String c, int w, int p, double price) { 
		super(w, p);
		setType(c);
		this.price = price;
	}
 
	public void setType(String t)  {
		carType = t;
	}
 
	public String getType() {
		return carType;
	}

    public double calculateDuty(){
        double duty = price * CARTAXRATE;
        return duty;
    }   
}