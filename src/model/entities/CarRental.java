package model.entities;

import java.util.Date;

public class CarRental {
	
	private Date Start;
	private Date Finish;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {		
	}

	public CarRental(Date start, Date finish, Vehicle vehicle) {		
		Start = start;
		Finish = finish;
		this.vehicle = vehicle;
	}

	public Date getStart() {
		return Start;
	}

	public void setStart(Date start) {
		Start = start;
	}

	public Date getFinish() {
		return Finish;
	}

	public void setFinish(Date finish) {
		Finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
}
