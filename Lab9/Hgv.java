// Student Name : Rachel O Shea
// Student ID : C00248457
// Date : 28/11/2025
// Purpose : Lab 9 Q2 - Test understanding of interfaces and inheritance in Java

public class Hgv extends RoadVehicle implements ImportDuty{
	private int cargo;
	private double price;

	public Hgv(){ 	
		this(0,0,0, 0.0);
	}

	public Hgv(int c, int w, int p, double price){ 
		super(w, p);
		setCargo(c);
		this.price = price;
	}

	public void setCargo(int size){
		cargo = size;
		}

	public int getCargo(){
		return cargo;
		}	

    public double calculateDuty(){
        double duty = price * HGVTAXRATE;
        return duty;
    }
}