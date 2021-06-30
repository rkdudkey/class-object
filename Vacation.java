package Homework;

public class Vacation {
	
	private String desination;
	private String hotel;
	private int days;
	private int budget;

	Vacation(String desination, String hotel){
		this.desination = desination;
		this.hotel = hotel;
	}
	
	Vacation(String desination, String hotel, int days){
		this.desination = desination;
		this.hotel = hotel;
		this.days = days;
	}

	public String getDesination() {
		return desination;
	}

	public void setDesination(String desination) {
		this.desination = desination;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	public boolean isExpensive() {
		return false;
	}
	
	public String writeImpression(String note) {
		return note;
	}
	

	public static void main(String[] args) {
		Vacation myVacation = new Vacation("narragansett", "aqua Blue");
		
		System.out.println(myVacation.getDesination());
		System.out.println(myVacation.getHotel());
		String note = myVacation.writeImpression("It is a great trip");
		System.out.println(note);
		
	}

}
