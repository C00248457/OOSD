// Student Name : Rachel O Shea
// Student ID : C00248457
// Date : 28/11/2025
// Purpose : Lab 9 Q2 - Test understanding of interfaces and inheritance in Java

public class RoadVehicle{
	private int wheels;	                //How many wheels it has
	private int passengers;             //How many passengers it can carry
 
	public RoadVehicle() {
 		this(0,0);	
	}
 
	public RoadVehicle(int w, int p) { 
		setWheels(w);
		setPass(p);
	}
 
	public void setWheels(int num) {
		wheels = num;
		}
 
	public int getWheels() {
		return wheels;
		}
 
	public void setPass(int num) {
		passengers = num;
		}
 
	public int getPass() {
		return passengers;
		}
}